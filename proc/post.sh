#!/usr/bin/env bash

cd data
tar -cvzf ../module/data.tar.gz *
cd ..
#cp files/* module/

cd module

string="
        <select1 ref=\"Entity_Types\">
          <label>{Entity_Types}<\/label>
          <item>
            <label>Options not loaded<\/label>
            <value>Options not loaded<\/value>
          <\/item>
        <\/select1>"
replacement="
        <group ref=\"Colgroup_1\" faims_style=\"orientation\">
          <label\/>
          <group ref=\"Col_0\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Entity_Types\">
              <label>{Entity_Types}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_1\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_User\">
              <label>{Select_User}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_2\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_Site\">
              <label>{Select_Site}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
        <\/group>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="
              <Entity_Types\/>"
replacement="
              <Colgroup_1>
                <Col_0>
                  <Entity_Types\/>
                <\/Col_0>
                <Col_1>
                  <Select_User\/>
                <\/Col_1>
                <Col_2>
                  <Select_Site\/>
                <\/Col_2>
              <\/Colgroup_1>
              <Select_User\/>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="
    <property name=\"Orientation Degree\">
      <validator type=\"blankchecker\">
        <param type=\"field\" value=\"measure\"\/>
      <\/validator>
    <\/property>"
replacement="
    <property name=\"Orientation Degree\">
      <validator type=\"querychecker\">
        <query><![CDATA[select coalesce(?,'') between 0 and 90, 'Orientation Degree must be between 0.0 and 90.0']]><\/query>
        <param type=\"field\" value=\"measure\" \/>
      <\/validator>
    <\/property>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" validation.xml

cat << EOF >> english.0.properties
Select_User=Select User
Select_Site=Select Site
Volume_Liters=Volume (Liters)
Must_be_between_0_0_and_90_0=(Must be between 0.0 and 90.0)
Cannot_Log_in=Cannot Log in
You_must_select_a_user_to_log_in=You must select a user to log in.
site_already_exists_head=Site Already Exists
site_already_exists_body=A site having this name and campaign year already exists. Tap 'OK' to change the 'New Site Name' and 'Year of Campaign' fields, or 'Cancel' to dismiss this message and create a new Site anyway.
trench_already_exists_head=Trench Already Exists
trench_already_exists_body=A trench having this trench ID already exists. Tap 'OK' to change the 'Trench ID' field, or 'Cancel' to dismiss this  message and create a new Trench anyway.
proceed_to_date_picker_head=Proceed To Date Picker?
proceed_to_date_picker_body=Have you established the closing date? If not, press 'Cancel' and return. If yes, press 'OK' and select date from date picker. Once selected, 'Date Closed' can only be edited but not blanked.
trench_id_required_head=Trench ID Required
trench_id_required_body=Searching requires that the Trench ID field is filled in.
logic_error_head=Logic Error
logic_error_body=Something happened which never should.
no_locus_selected=No Locus selected
no_relationship_selected=No relationship selected
soil_texture_no_match=Match not found. You shouldn't see this, but select the result manually.
no_user_selected_head=No User Selected
no_user_selected_body=A user must be selected in order to log in.
no_device_code_selected_head=No Device Code Selected
no_device_code_selected_body=A device code must be selected in order to log in.

arbitrarily_separated_from=Arbitrarily separated from
bonded_to=Bonded to
broadly_contemporary_with=Broadly contemporary with
butted_by=Butted by
butts=Butts
child_of=Child of
covered_by=Covered by
covers=Covers
cut_by=Cut by
cuts=Cuts
earlierlater=EarlierLater
filled_with=Filled with
fill_of=Fill of
immediately_earlier_than=Immediately Earlier Than
immediately_later_than=Immediately Later Than
includes=includes
is_included_in=is included in
parentchild=ParentChild
parent_of=Parent of
precisely_contemporary_with=Precisely Contemporary with
invalid_trench_id_head=Invalid Trench ID
invalid_trench_id_body=Tap 'Cancel' to change the 'Trench ID' field, or 'OK' to proceed.


perf_mode_head=Performance Testing Mode Enabled
perf_mode_body=Performance testing mode has been enabled for this session. Performance testing mode adds some features which help to benchmark queries, however it may reduce the responsiveness of the module.\n\nTo disable performance testing mode, set your device's date to any year after 2015.


perf_dummy_head=Create Dummy Records?
perf_dummy_body_1=Do you wish to create dummy records? Tapping 'OK' will create
perf_dummy_body_2=new entities. Entity creation takes a few minutes.\n\nIf you would not like to create any dummy records, tap 'Cancel' to dismiss this message.


perf_dummy_busy_head=Creating Entities...
perf_dummy_busy_body=entities are currently being created. This can take a few minutes. During this time the module may appear to freeze. Please wait.


perf_digest_1_head=Entities Created!
perf_digest_1_body_1=entities have been successfully created.
perf_digest_1_body_2=The total number of entities on this device, by type, is as follows:\n\n

perf_digest_2_head=Display a Record Digest?
perf_digest_2_body=Would you like to display the number of records present on this device? Tap 'OK' to display them, or 'Cancel' to dismiss this message.


valid_control_head=Invalid Field(s) Found
valid_control_body_1=The following fields are invalid:\n
valid_control_body_2=You must enter data into these fields to proceed.
EOF

rm ui_schema.xml.original
rm validation.xml.original
