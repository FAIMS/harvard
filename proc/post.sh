#!/usr/bin/env bash

cd module

# Notify the current user if they try to add relationships to the current
# context without having saved it first
string="
  newTab(\"Context_Group_Relationship\", true);"
replacement="
  String tabgroup = \"Context_Group\";
  if (isNull(getUuid(tabgroup))){
    showToast(\"{You_must_save_this_tabgroup_first}\");
    return;
  }
  $string"
perl -0777 -i.original -pe "s/\\Q$string/$replacement/igs" ui_logic.bsh

# Notify the current user if they try to add relationships to the current
# context without having saved it first
string="
  newTab(\"Relationship\", true);"
replacement="
  String tabgroup = \"Context\";
  if (isNull(getUuid(tabgroup))){
    showToast(\"{You_must_save_this_tabgroup_first}\");
    return;
  }
  $string"
perl -0777 -i.original -pe "s/\\Q$string/$replacement/igs" ui_logic.bsh

rm ui_logic.bsh.original
rm ui_schema.xml.original
