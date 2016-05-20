#!/usr/bin/env bash

# Escape sed's special characters
escape_sed() {
    echo "$1" |
    sed \
        -e 's/\//\\\//g' \
        -e 's/\&/\\\&/g'
}

# In module.xml, replace any line <!--@SOURCE: path/to/file--> with the contents
# of the file at path/to/file.
filenames=$(find . -type f -printf '%P\n')
for filename in $filenames
do
    whitespace='\s*'                           # Zero or more whitespace chars
    dot_slash='\(\.\/\)\?'                     # Optional './'
    escaped_filename=$(escape_sed "$filename") # Escape slashes in filenames

    sed -i -e "/<!--@SOURCE:$whitespace$dot_slash$escaped_filename-->/{
        r $filename
        d
    }" module.xml
done
