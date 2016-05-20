#!/bin/bash

./makeElement.sh style_orientation_orientation "horizontal" input 1 false false false false false .
./makeElement.sh style_even_layout_weight "1" input 1 false false false false false .
./makeElement.sh style_large_layout_weight "3" input 1 false false false false false .
./makeElement.sh User_User_List_Users "Users" dropdown 1 false false false false false .
./makeElement.sh User_User_List_Trench "Trench" dropdown 1 false false false false false .
./makeElement.sh User_User_List_Device_Code "Device Code" dropdown 1 false false false false false .
./makeElement.sh User_User_List_Login "Login" button 1 false false false false false .
./makeElement.sh User_User_List_Module_Guide "Module Guide" button 1 false false false false false .
./makeElement.sh User_Help_Help "" webview 1 false false false false false .
./makeElement.sh Control_Contexts_Create_New_Context "Create New Context" button 1 false false false false false .
./makeElement.sh Control_Contexts_Create_New_Feature "Create New Feature" button 1 false false false false false .
./makeElement.sh Control_Contexts_Create_New_Diary "Create New Diary" button 1 false false false false false .
./makeElement.sh Control_Contexts_Create_New_Legacy "Create New Legacy" button 1 false false false false false .
./makeElement.sh Control_Search_Search_Term "Search Term" input 2 false false false false false .
./makeElement.sh Control_Search_Search_Button "Search" button 2 false false false false false .
./makeElement.sh Control_Search_Entity_Types "Entity Types" dropdown 1 false false false false false .
./makeElement.sh Control_Search_Entity_List "Entity List" list 1 false false false false false .
./makeElement.sh Context_General_AreaCode "AreaCode" dropdown 3 false false true true false .
./makeElement.sh Context_General_Context_ID "Context ID" input 3 false false true true false .
./makeElement.sh Context_General_Context_Name "Context Name" input 3 false false true false false .
./makeElement.sh Context_General_Grid_X "Grid X" input 2 false false true false false .
./makeElement.sh Context_General_Grid_Y "Grid Y" input 2 false false true false false .
./makeElement.sh Context_General_Location_Note "Location Note" input 1 false false true true false .
./makeElement.sh Context_General_Date_Opened "Date Opened" input 2 false false true false false .
./makeElement.sh Context_General_Excavators "Excavators" input 2 false false true false false .
./makeElement.sh Context_General_Excavation_Method "Excavation Method" checkbox 2 false false true true false .
./makeElement.sh Context_General_Horizon_Boundary "Horizon Boundary" dropdown 2 false false true false false .
./makeElement.sh Context_General_Contamination "Contamination" dropdown 2 false false true false false .
./makeElement.sh Context_General_Context_Type "Context Type" pictureGallery 1 false false true false false .
./makeElement.sh Context_General_Fill_in_Context_Type_Details "Fill in Context Type Details" button 1 false false false false false .
./makeElement.sh Context_General_Plans "Plans" input 2 false false true true false .
./makeElement.sh Context_General_Section_Numbers "Section Numbers" input 2 false false true true false .
./makeElement.sh Context_General_Date_Closed "Date Closed" input 2 false false true false false .
./makeElement.sh Context_General_Add_Date_Closed "Add Date Closed" button 2 false false false false false .
./makeElement.sh Context_General_author "Record Created By:" input 2 false false true false false .
./makeElement.sh Context_General_timestamp "Record Created Date:" input 2 false false true false false .
./makeElement.sh Context_Measure_Highest_Level "Highest Level" input 2 false false true true false .
./makeElement.sh Context_Measure_Lowest_Level "Lowest Level" input 2 false false true true false .
./makeElement.sh Context_Measure_Length "Length" input 3 false false true true false .
./makeElement.sh Context_Measure_Width "Width" input 3 false false true true false .
./makeElement.sh Context_Measure_Depth "Depth" input 3 false false true true false .
./makeElement.sh Context_Measure_Volume "Volume" input 1 false false true true false .
./makeElement.sh Context_Measure_Add_Height "Add Height" button 1 false false false false false .
./makeElement.sh Context_Measure_Height_List "Height List" list 1 false false false false false .
./makeElement.sh Context_Cut_Cut_Your_Interpretation "Cut Your Interpretation" dropdown 1 false false true true false .
./makeElement.sh Context_Cut_Shape_of_Cut "Shape of Cut" dropdown 2 false false true true false .
./makeElement.sh Context_Cut_Shape_of_Cut_-_Note "Shape of Cut - Note" input 2 false false true false false .
./makeElement.sh Context_Cut_Shape_of_Corners "Shape of Corners" radio 1 false false true true false .
./makeElement.sh Context_Cut_Break_of_Slope_-_Top "Break of Slope - Top" radio 1 false false true true false .
./makeElement.sh Context_Cut_Sides_of_Cut "Sides of Cut" dropdown 2 false false true true false .
./makeElement.sh Context_Cut_Shape_of_Base "Shape of Base" dropdown 2 false false true true false .
./makeElement.sh Context_Cut_Cut_Function "Cut Function" input 1 false false true true false .
./makeElement.sh Context_Cut_Orientation "Orientation" dropdown 1 false false true true false .
./makeElement.sh Context_Cut_Inclination_of_axis "Inclination of axis" dropdown 1 false false true true false .
./makeElement.sh Context_Structures_Structure_Your_Interpretation "Structure Your Interpretation" dropdown 1 false false true true false .
./makeElement.sh Context_Structures_Structural_Components "Structural Components" dropdown 1 false false true false false .
./makeElement.sh Context_Structures_Component_Finish "Component Finish" input 1 false false true false false .
./makeElement.sh Context_Structures_Bonding "Bonding" dropdown 1 false false true false false .
./makeElement.sh Context_Structures_Bonding_Details "Bonding Details" input 1 false false true false false .
./makeElement.sh Context_Structures_Distinguishing_Marks "Distinguishing Marks" input 1 false false true false false .
./makeElement.sh Context_Structures_Structure_Description "Structure Description" input 1 false false true true false .
./makeElement.sh Context_Structures_Number_Courses "Number Courses" input 1 false false true false false .
./makeElement.sh Context_Structures_Set_In_Cut "Set In Cut" input 1 false false true false false .
./makeElement.sh Context_Structures_Structure_Shape "Structure Shape" dropdown 1 false false true false false .
./makeElement.sh Context_Structures_Mudbrick_Shape "Mudbrick Shape" dropdown 1 false false true false false .
./makeElement.sh Context_Structures_Enter_Sediment_Description "Enter Sediment Description" button 1 false false false false false .
./makeElement.sh Context_Deposit_Deposit_Your_Interpretation "Deposit Your Interpretation" dropdown 1 false false true true false .
./makeElement.sh Context_Deposit_Soil_Compaction_Type "Soil Compaction Type" dropdown 1 false false true true false .
./makeElement.sh Context_Deposit_Soil_Compaction_Description "Soil Compaction Description" input 1 false false true false false .
./makeElement.sh Context_Deposit_Soil_Particle_Sorting "Soil Particle Sorting" pictureGallery 1 false false true false false .
./makeElement.sh Context_Deposit_Soil_Texture "Soil Texture" dropdown 2 false false true true false .
./makeElement.sh Context_Deposit_Texture_Helper "Texture Helper" button 2 false false false false false .
./makeElement.sh Context_Deposit_Soil_Colour "Soil Colour" input 1 false false true false false .
./makeElement.sh Context_Deposit_Composition_Type "Composition Type" dropdown 2 false false true true false .
./makeElement.sh Context_Deposit_Deposit_Bedding "Deposit Bedding" dropdown 2 false false true true false .
./makeElement.sh Context_Deposit_Sterile "Sterile" radio 2 false false true false false .
./makeElement.sh Context_Deposit_Deposit_Inclusions "Deposit Inclusions" input 2 false false true true false .
./makeElement.sh Context_Deposit_Add_New_Matrix "Add New Sediment/Aggregate" button 1 false false false false false .
./makeElement.sh Context_Deposit_Associated_Matrices "Associated Sediment/Aggregates" dropdown 1 false false false false false .
./makeElement.sh Context_Skeleton_Space "Space" input 2 false false true false false .
./makeElement.sh Context_Skeleton_Building "Building" input 2 false false true false false .
./makeElement.sh Context_Skeleton_Mid_X "Mid X" input 2 false false true false false .
./makeElement.sh Context_Skeleton_Mid_Y "Mid Y" input 2 false false true false false .
./makeElement.sh Context_Skeleton_Skeleton_Dimensions "Skeleton Dimensions" input 1 false false true false false .
./makeElement.sh Context_Skeleton_Skeleton_Head "Skeleton Head" input 2 false false true true false .
./makeElement.sh Context_Skeleton_Skeleton_Body "Skeleton Body" input 2 false false true true false .
./makeElement.sh Context_Skeleton_Skeleton_Left_Arm "Skeleton Left Arm" input 2 false false true true false .
./makeElement.sh Context_Skeleton_Skeleton_Right_Arm "Skeleton Right Arm" input 2 false false true true false .
./makeElement.sh Context_Skeleton_Skeleton_Left_Leg "Skeleton Left Leg" input 2 false false true true false .
./makeElement.sh Context_Skeleton_Skeleton_Right_Leg "Skeleton Right Leg" input 2 false false true true false .
./makeElement.sh Context_Skeleton_Skeleton_Condition "Skeleton Condition" input 1 false false true true false .
./makeElement.sh Context_Skeleton_Skeleton_Surface_Modifications "Skeleton Surface Modifications" input 1 false false true false false .
./makeElement.sh Context_Skeleton_Skeleton_Environment "Skeleton Environment" input 1 false false true false false .
./makeElement.sh Context_Skeleton_Skeleton_Days_Exposed "Skeleton Days Exposed" input 1 false false true false false .
./makeElement.sh Context_Skeleton_Target_A_X "Target A X" input 3 false false true true false .
./makeElement.sh Context_Skeleton_Target_A_Y "Target A Y" input 3 false false true true false .
./makeElement.sh Context_Skeleton_Target_A_Z "Target A Z" input 3 false false true true false .
./makeElement.sh Context_Skeleton_Target_B_X "Target B X" input 3 false false true false false .
./makeElement.sh Context_Skeleton_Target_B_Y "Target B Y" input 3 false false true false false .
./makeElement.sh Context_Skeleton_Target_B_Z "Target B Z" input 3 false false true false false .
./makeElement.sh Context_Skeleton_Target_C_X "Target C X" input 3 false false true false false .
./makeElement.sh Context_Skeleton_Target_C_Y "Target C Y" input 3 false false true false false .
./makeElement.sh Context_Skeleton_Target_C_Z "Target C Z" input 3 false false true false false .
./makeElement.sh Context_Skeleton_Target_D_X "Target D X" input 3 false false true false false .
./makeElement.sh Context_Skeleton_Target_D_Y "Target D Y" input 3 false false true false false .
./makeElement.sh Context_Skeleton_Target_D_Z "Target D Z" input 3 false false true false false .
./makeElement.sh Context_Skeleton_Skeleton_Notes "Skeleton Notes" input 1 false false true false false .
./makeElement.sh Context_Int_Your_description "Your description" input 1 false false true true false .
./makeElement.sh Context_Int_Your_Discussion "Your Discussion" input 1 false false true true false .
./makeElement.sh Context_Context_Group_Add_Context_Group "Add Context Group" button 1 false false false false false .
./makeElement.sh Context_Context_Group_List_of_Related_Context_Groups "List of Related Context Groups" list 1 false false false false false .
./makeElement.sh Context_Relationships_Create_Relationships_to_This_Context "Create Relationships to This Context" button 1 false false false false false .
./makeElement.sh Context_Relationships_Existing_Relationships_to_This_Context "Existing Relationships to This Context" list 2 false false false false false .
./makeElement.sh Context_Relationships_Selected_Relationship "Selected Relationship" webview 2 false false false false false .
./makeElement.sh Context_Relationships_Load_Related_Context "Load Related Context" button 2 false false false false false .
./makeElement.sh Context_Relationships_Delete_Relationship "Delete Relationship" button 2 false false false false false .
./makeElement.sh Context_Artefacts_Add_Special_Find "Add Special Find" button 1 false false false false false .
./makeElement.sh Context_Artefacts_List_of_Related_Special_Finds "List of Related Special Finds" list 1 false false false false false .
./makeElement.sh Context_Samples_Add_Sample "Add Sample" button 1 false false false false false .
./makeElement.sh Context_Samples_List_of_Sample "List of Sample" list 1 false false false false false .
./makeElement.sh Context_Add_Sketch "Sketch" file 1 false false true false false .
./makeElement.sh Context_Add_Button_Sketch "Attach File" button 1 false false false false false .
./makeElement.sh Context_Add_Photo "Photo" file 1 false false true false false .
./makeElement.sh Context_Add_Button_Photo "Attach Photograph" button 1 false false false false false .
./makeElement.sh Context_Add_Audio "Audio" file 1 false false true false false .
./makeElement.sh Context_Add_Button_Audio "Attach Audio" button 1 false false false false false .
./makeElement.sh Context_Add_Video "Video" file 1 false false true false false .
./makeElement.sh Context_Add_Button_Video "Attach Video" button 1 false false false false false .
./makeElement.sh Context_Material_Helper_Soil_Texture_Helper "Material Helper" dropdown 1 false false true false false .
./makeElement.sh Context_Material_Helper_Update_Material "Update Material" button 1 false false false false false .
./makeElement.sh Context_Vars_Site_Code "Site Code" input 1 false false true false false .
./makeElement.sh Context_Vars_Device_Code "Device Code" dropdown 1 false false true false false .
./makeElement.sh Context_Vars_SearchHelp "SearchHelp" input 1 false false true false false .
./makeElement.sh Context_Group_Gen_AreaCode "Trench" input 3 false false true true false .
./makeElement.sh Context_Group_Gen_Context_Group_ID "Feature ID" input 3 false false true true false .
./makeElement.sh Context_Group_Gen_Title "Feature Title" input 3 false false true true false .
./makeElement.sh Context_Group_Gen_Building "Building" input 2 false false true false false .
./makeElement.sh Context_Group_Gen_Space "Space" input 2 false false true false false .
./makeElement.sh Context_Group_Gen_Location_Note_CG "Location Note CG" input 1 false false true false false .
./makeElement.sh Context_Group_Gen_CG_Context_Type "CG Context Type" pictureGallery 1 false false true true false .
./makeElement.sh Context_Group_Gen_CG_Your_description "CG Your description" input 1 false false true true false .
./makeElement.sh Context_Group_Gen_CG_Your_Interpretation "CG Your Interpretation" input 1 false false true true false .
./makeElement.sh Context_Group_Gen_Your_Discussion "Your Discussion" input 1 false false true false false .
./makeElement.sh Context_Group_Gen_Length "Length" input 3 false false true false false .
./makeElement.sh Context_Group_Gen_Width "Width" input 3 false false true false false .
./makeElement.sh Context_Group_Gen_Depth "Depth" input 3 false false true false false .
./makeElement.sh Context_Group_Gen_Mid_X "Mid X" input 2 false false true false false .
./makeElement.sh Context_Group_Gen_Mid_Y "Mid Y" input 2 false false true false false .
./makeElement.sh Context_Group_Gen_CG_Phase_Notes "CG Phase Notes" input 1 false false true false false .
./makeElement.sh Context_Group_Gen_CG_Plans "CG Plans" input 1 false false true false false .
./makeElement.sh Context_Group_Gen_CG_Section_Numbers "CG Section Numbers" input 1 false false true false false .
./makeElement.sh Context_Group_Gen_author "Record Created By:" input 2 false false true false false .
./makeElement.sh Context_Group_Gen_timestamp "Date recorded:" input 2 false false true false false .
./makeElement.sh Context_Group_Context_Group_Contexts_Create_Relationships_to_This_Context_Group "Create Relationships to This Context Group" button 1 false false false false false .
./makeElement.sh Context_Group_Context_Group_Contexts_Existing_Relationships_to_This_Context_Group "Existing Relationships to This Context Group" list 2 false false false false false .
./makeElement.sh Context_Group_Context_Group_Contexts_Selected_Relationship "Selected Relationship" webview 2 false false false false false .
./makeElement.sh Context_Group_Context_Group_Contexts_Load_Related_Context "Load Related Context" button 2 false false false false false .
./makeElement.sh Context_Group_Context_Group_Contexts_Delete_Relationship "Delete Relationship" button 2 false false false false false .
./makeElement.sh Context_Group_Add_View_Attached_Files "View Attached Files" button 1 false false false false false .
./makeElement.sh Context_Group_Add_Sketch "Sketch" file 1 false false true false false .
./makeElement.sh Context_Group_Add_Button_Sketch "Attach File" button 1 false false false false false .
./makeElement.sh Context_Group_Add_Photo "Photo" file 1 false false true false false .
./makeElement.sh Context_Group_Add_Button_Photo "Attach Photograph" button 1 false false false false false .
./makeElement.sh Context_Group_Add_Audio "Audio" file 1 false false true false false .
./makeElement.sh Context_Group_Add_Button_Audio "Attach Audio" button 1 false false false false false .
./makeElement.sh Context_Group_Add_Video "Video" file 1 false false true false false .
./makeElement.sh Context_Group_Add_Button_Video "Attach Video" button 1 false false false false false .
./makeElement.sh Context_Group_Add_Guide_2 "Here you can enter filenames or unique reference numbers for image stored on another device." webview 1 false false false false false .
./makeElement.sh Context_Group_Add_Add_Photograph_Log "Add Photograph Log" button 1 false false false false false .
./makeElement.sh Context_Group_Add_Select_a_Photograph_Log "Select a Photograph Log" dropdown 1 false false false false false .
./makeElement.sh Context_Group_Vars_Device_Code "Device Code" dropdown 1 false false true false false .
./makeElement.sh Context_Group_Vars_Site_Code "Site Code" input 1 false false true false false .
./makeElement.sh Matrix_Matrix_Component "Component" dropdown 2 false false true false false .
./makeElement.sh Matrix_Matrix_Percentage "Percentage" input 2 false false true false false .
./makeElement.sh Matrix_Matrix_Shape "Shape" pictureGallery 1 false false true false false .
./makeElement.sh Matrix_Vars_AreaCode "AreaCode" dropdown 1 false false true false false .
./makeElement.sh Matrix_Vars_Context_ID "Context ID" input 1 false false true false false .
./makeElement.sh Height_Height_Number "Number" input 1 false false true true false .
./makeElement.sh Height_Height_X "X" input 1 false false true true false .
./makeElement.sh Height_Height_Y "Y" input 1 false false true true false .
./makeElement.sh Height_Height_Z "Z" input 1 false false true true false .
./makeElement.sh Height_Height_Notes "Notes" input 1 false false true true false .
./makeElement.sh Height_Vars_AreaCode "AreaCode" dropdown 1 false false true false false .
./makeElement.sh Height_Vars_Context_ID "Context ID" input 1 false false true false false .
./makeElement.sh Sample_Deposit_Samples_Context_ID "Context ID" input 3 false false true true false .
./makeElement.sh Sample_Deposit_Samples_Sample_ID "Sample ID" input 3 false false true true false .
./makeElement.sh Sample_Deposit_Samples_Sample_Type "Sample Type" dropdown 3 false false true true false .
./makeElement.sh Sample_Deposit_Samples_Sample_Volume "Sample Volume" input 1 false false true false false .
./makeElement.sh Sample_Deposit_Samples_Sample_X "Sample X" input 3 false false true true false .
./makeElement.sh Sample_Deposit_Samples_Sample_Y "Sample Y" input 3 false false true true false .
./makeElement.sh Sample_Deposit_Samples_Sample_Z "Sample Z" input 3 false false true true false .
./makeElement.sh Sample_Deposit_Samples_Sample_Location "Sample Location" dropdown 2 false false true false false .
./makeElement.sh Sample_Deposit_Samples_Sample_Comments "Sample Comments" input 2 false false true false false .
./makeElement.sh Sample_Add_Sketch "Sketch" file 1 false false true false false .
./makeElement.sh Sample_Add_Button_Sketch "Attach File" button 1 false false false false false .
./makeElement.sh Sample_Add_Photo "Photo" file 1 false false true false false .
./makeElement.sh Sample_Add_Button_Photo "Attach Photograph" button 1 false false false false false .
./makeElement.sh Sample_Add_Audio "Audio" file 1 false false true false false .
./makeElement.sh Sample_Add_Button_Audio "Attach Audio" button 1 false false false false false .
./makeElement.sh Sample_Add_Video "Video" file 1 false false true false false .
./makeElement.sh Sample_Add_Button_Video "Attach Video" button 1 false false false false false .
./makeElement.sh Sample_Add_View_Attached_Files "View Attached Files" button 1 false false false false false .
./makeElement.sh Sample_Vars_AreaCode "AreaCode" dropdown 1 false false true false false .
./makeElement.sh Sample_Vars_Device_Code "Device Code" dropdown 1 false false true false false .
./makeElement.sh Sample_Vars_Site_Code "Site Code" input 1 false false true false false .
./makeElement.sh Special_Find_Special_Find_Context_ID "Context ID" input 3 false false true false true .
./makeElement.sh Special_Find_Special_Find_Special_Find_ID "Special Find ID" input 3 false false true true false .
./makeElement.sh Special_Find_Special_Find_Special_Find_Class "Special Find Class" dropdown 3 false false true false false .
./makeElement.sh Special_Find_Special_Find_Source "Source" dropdown 1 false false true false false .
./makeElement.sh Special_Find_Special_Find_Special_Find_Location "Special Find Location" dropdown 1 false false true false false .
./makeElement.sh Special_Find_Special_Find_Special_Find_Description "Special Find Description" input 1 false false true true false .
./makeElement.sh Special_Find_Special_Find_Special_Find_X "Special Find X" input 3 false false true true false .
./makeElement.sh Special_Find_Special_Find_Special_Find_Y "Special Find Y" input 3 false false true true false .
./makeElement.sh Special_Find_Special_Find_Special_Find_Z "Special Find Z" input 3 false false true true false .
./makeElement.sh Special_Find_Special_Find_Special_Find_Comment "Special Find Comment" input 1 false false true false false .
./makeElement.sh Special_Find_Special_Find_Photo "Photo" file 1 false false true false false .
./makeElement.sh Special_Find_Special_Find_Button_Photo "Attach Photograph" button 1 false false false false false .
./makeElement.sh Special_Find_Special_Find_Audio "Audio" file 1 false false true false false .
./makeElement.sh Special_Find_Special_Find_Button_Audio "Attach Audio" button 1 false false false false false .
./makeElement.sh Special_Find_Special_Find_Video "Video" file 1 false false true false false .
./makeElement.sh Special_Find_Special_Find_Button_Video "Attach Video" button 1 false false false false false .
./makeElement.sh Special_Find_Special_Find_View_Attached_Files "View Attached Files" file 1 false false true false false .
./makeElement.sh Special_Find_Special_Find_Button_View_Attached_Files "Attach File" button 1 false false false false false .
./makeElement.sh Special_Find_Vars_AreaCode "AreaCode" dropdown 1 false false true false false .
./makeElement.sh Special_Find_Vars_Device_Code "Device Code" dropdown 1 false false true false false .
./makeElement.sh Special_Find_Vars_Site_Code "Site Code" input 1 false false true false false .
./makeElement.sh Photograph_Log_Photograph_Log_Photo_Context_ID "Photo Context ID" input 3 false false true false false .
./makeElement.sh Photograph_Log_Photograph_Log_Photo_Context_Group_ID "Photo Context Group ID" input 3 false false true false true .
./makeElement.sh Photograph_Log_Photograph_Log_Photograph_Reference_ID "Photograph Reference ID" input 3 false false true false false .
./makeElement.sh Photograph_Log_Photograph_Log_Scene_Type "Scene Type" dropdown 1 false false true false false .
./makeElement.sh Photograph_Log_Photograph_Log_Photograph_Description "Photograph Description" input 1 false false true false false .
./makeElement.sh Photograph_Log_Vars_AreaCode "AreaCode" dropdown 1 false false true false false .
./makeElement.sh Photograph_Log_Vars_Site_Code "Site Code" input 1 false false true false false .
./makeElement.sh Photograph_Log_Vars_Device_Code "Device Code" dropdown 1 false false true false false .
./makeElement.sh Diary_Diary_timestamp "Timestamp" input 2 false false true false false .
./makeElement.sh Diary_Diary_author "Author" input 2 false false true false false .
./makeElement.sh Diary_Diary_Title "Title" input 1 false false true false false .
./makeElement.sh Diary_Diary_AreaCode "AreaCode" dropdown 1 false false true false false .
./makeElement.sh Diary_Diary_Text "Text" input 1 false false true false false .
./makeElement.sh Diary_Diary_FileAttach "FileAttach" file 1 false false true false false .
./makeElement.sh Diary_Diary_Button_FileAttach "Attach File" button 1 false false false false false .
./makeElement.sh Diary_Diary_Audio "Audio" file 1 false false true false false .
./makeElement.sh Diary_Diary_Button_Audio "Attach Audio" button 1 false false false false false .
./makeElement.sh Diary_Diary_Video "Video" file 1 false false true false false .
./makeElement.sh Diary_Diary_Button_Video "Attach Video" button 1 false false false false false .
./makeElement.sh Diary_Diary_Photo "Photo" file 1 false false true false false .
./makeElement.sh Diary_Diary_Button_Photo "Attach Photograph" button 1 false false false false false .
./makeElement.sh Diary_Diary_View_Attached_Files "View Attached Files" button 1 false false false false false .
./makeElement.sh Legacy_Legacy_LegacyIdentifier "LegacyIdentifier" input 1 false false true false false .
./makeElement.sh Relationship_Relationships_Parent_Identifier "Parent Identifier" webview 1 false false false false false .
./makeElement.sh Relationship_Relationships_Square "Square" dropdown 2 false false false false false .
./makeElement.sh Relationship_Relationships_Relationship_Type "Relationship Type" dropdown 2 false false false false false .
./makeElement.sh Relationship_Relationships_Search "Search" button 1 false false false false false .
./makeElement.sh Relationship_Relationships_Add_Relationship "Add Relationship" button 2 false false false false false .
./makeElement.sh Relationship_Relationships_Proposed_Relationship "Proposed Relationship" webview 2 false false false false false .
./makeElement.sh Relationship_Relationships_Delete_Relationship "Delete Relationship" button 2 false false false false false .
./makeElement.sh Relationship_Relationships_Selected_Relationship "Selected Relationship" webview 2 false false false false false .
./makeElement.sh Relationship_Relationships_Unrelated_Contexts "Unrelated Contexts" list 2 false false false false false .
./makeElement.sh Relationship_Relationships_Existing_Relationships "Existing Relationships" list 2 false false false false false .
./makeElement.sh Context_Group_Relationship_Relationships_Parent_Identifier "Parent Identifier" webview 1 false false false false false .
./makeElement.sh Context_Group_Relationship_Relationships_Square "Square" dropdown 1 false false false false false .
./makeElement.sh Context_Group_Relationship_Relationships_Search "Search" button 1 false false false false false .
./makeElement.sh Context_Group_Relationship_Relationships_Add_Relationship "Add Relationship" button 2 false false false false false .
./makeElement.sh Context_Group_Relationship_Relationships_Proposed_Relationship "Proposed Relationship" webview 2 false false false false false .
./makeElement.sh Context_Group_Relationship_Relationships_Delete_Relationship "Delete Relationship" button 2 false false false false false .
./makeElement.sh Context_Group_Relationship_Relationships_Selected_Relationship "Selected Relationship" webview 2 false false false false false .
./makeElement.sh Context_Group_Relationship_Relationships_Unrelated_Contexts "Unrelated Contexts" list 2 false false false false false .
./makeElement.sh Context_Group_Relationship_Relationships_Existing_Relationships "Existing Relationships" list 2 false false false false false .
