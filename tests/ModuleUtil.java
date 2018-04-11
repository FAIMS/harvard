package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Date_Closed
     */
    public static View get_DateClosed(Solo solo) {
        String ref = "Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Diary
     */
    public static View get_Diary(Solo solo) {
        String ref = "Diary";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  FCN
     */
    public static View get_FCN(Solo solo) {
        String ref = "FCN";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Legacy
     */
    public static View get_Legacy(Solo solo) {
        String ref = "Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Locus
     */
    public static View get_Locus(Solo solo) {
        String ref = "Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Photograph_Log
     */
    public static View get_PhotographLog(Solo solo) {
        String ref = "Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Relationship
     */
    public static View get_Relationship(Solo solo) {
        String ref = "Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Sediment_Aggregate
     */
    public static View get_SedimentAggregate(Solo solo) {
        String ref = "Sediment_Aggregate";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Site
     */
    public static View get_Site(Solo solo) {
        String ref = "Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Soil_Munsel_Color
     */
    public static View get_SoilMunselColor(Solo solo) {
        String ref = "Soil_Munsel_Color";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Stratum_Feature
     */
    public static View get_StratumFeature(Solo solo) {
        String ref = "Stratum_Feature";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Stratum_Feature_Relationship
     */
    public static View get_StratumFeatureRelationship(Solo solo) {
        String ref = "Stratum_Feature_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Trench
     */
    public static View get_Trench(Solo solo) {
        String ref = "Trench";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Trench_Files
     */
    public static View get_TrenchFiles(Solo solo) {
        String ref = "Trench_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  User
     */
    public static View get_User(Solo solo) {
        String ref = "User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Next_IDs
     */
    public static View get_Control_NextIDs(Solo solo) {
        String ref = "Control/Next_IDs";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Site
     */
    public static View get_Control_Site(Solo solo) {
        String ref = "Control/Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Date_Closed/Date_Closed
     */
    public static View get_DateClosed_DateClosed(Solo solo) {
        String ref = "Date_Closed/Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Diary/Diary
     */
    public static View get_Diary_Diary(Solo solo) {
        String ref = "Diary/Diary";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Diary/Vars
     */
    public static View get_Diary_Vars(Solo solo) {
        String ref = "Diary/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  FCN/General
     */
    public static View get_FCN_General(Solo solo) {
        String ref = "FCN/General";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  FCN/Vars
     */
    public static View get_FCN_Vars(Solo solo) {
        String ref = "FCN/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Legacy/Legacy
     */
    public static View get_Legacy_Legacy(Solo solo) {
        String ref = "Legacy/Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Legacy/Var
     */
    public static View get_Legacy_Var(Solo solo) {
        String ref = "Legacy/Var";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Add
     */
    public static View get_Locus_Add(Solo solo) {
        String ref = "Locus/Add";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Construction
     */
    public static View get_Locus_Construction(Solo solo) {
        String ref = "Locus/Construction";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Cut
     */
    public static View get_Locus_Cut(Solo solo) {
        String ref = "Locus/Cut";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Deposit
     */
    public static View get_Locus_Deposit(Solo solo) {
        String ref = "Locus/Deposit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/FCNs
     */
    public static View get_Locus_FCNs(Solo solo) {
        String ref = "Locus/FCNs";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/General
     */
    public static View get_Locus_General(Solo solo) {
        String ref = "Locus/General";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Int
     */
    public static View get_Locus_Int(Solo solo) {
        String ref = "Locus/Int";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Material_Helper
     */
    public static View get_Locus_MaterialHelper(Solo solo) {
        String ref = "Locus/Material_Helper";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Measure
     */
    public static View get_Locus_Measure(Solo solo) {
        String ref = "Locus/Measure";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Relationships
     */
    public static View get_Locus_Relationships(Solo solo) {
        String ref = "Locus/Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Skeleton
     */
    public static View get_Locus_Skeleton(Solo solo) {
        String ref = "Locus/Skeleton";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Locus/Vars
     */
    public static View get_Locus_Vars(Solo solo) {
        String ref = "Locus/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Photograph_Log/Photograph_Log
     */
    public static View get_PhotographLog_PhotographLog(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Photograph_Log/Vars
     */
    public static View get_PhotographLog_Vars(Solo solo) {
        String ref = "Photograph_Log/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Relationship/Legacies
     */
    public static View get_Relationship_Legacies(Solo solo) {
        String ref = "Relationship/Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Relationship/Relationships
     */
    public static View get_Relationship_Relationships(Solo solo) {
        String ref = "Relationship/Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Relationship/Vars
     */
    public static View get_Relationship_Vars(Solo solo) {
        String ref = "Relationship/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Sediment_Aggregate/Sediment_Aggregate
     */
    public static View get_SedimentAggregate_SedimentAggregate(Solo solo) {
        String ref = "Sediment_Aggregate/Sediment_Aggregate";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Sediment_Aggregate/Vars
     */
    public static View get_SedimentAggregate_Vars(Solo solo) {
        String ref = "Sediment_Aggregate/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Site/Site
     */
    public static View get_Site_Site(Solo solo) {
        String ref = "Site/Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Site/Vars
     */
    public static View get_Site_Vars(Solo solo) {
        String ref = "Site/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Soil_Munsel_Color/Add_Soil_Munsel_Color
     */
    public static View get_SoilMunselColor_AddSoilMunselColor(Solo solo) {
        String ref = "Soil_Munsel_Color/Add_Soil_Munsel_Color";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Soil_Munsel_Color/Vars
     */
    public static View get_SoilMunselColor_Vars(Solo solo) {
        String ref = "Soil_Munsel_Color/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Stratum_Feature/Add
     */
    public static View get_StratumFeature_Add(Solo solo) {
        String ref = "Stratum_Feature/Add";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Stratum_Feature/General
     */
    public static View get_StratumFeature_General(Solo solo) {
        String ref = "Stratum_Feature/General";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Stratum_Feature/Stratum_Feature_Loci
     */
    public static View get_StratumFeature_StratumFeatureLoci(Solo solo) {
        String ref = "Stratum_Feature/Stratum_Feature_Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Stratum_Feature/Vars
     */
    public static View get_StratumFeature_Vars(Solo solo) {
        String ref = "Stratum_Feature/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Stratum_Feature_Relationship/Legacies
     */
    public static View get_StratumFeatureRelationship_Legacies(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Stratum_Feature_Relationship/Relationships
     */
    public static View get_StratumFeatureRelationship_Relationships(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Stratum_Feature_Relationship/Vars
     */
    public static View get_StratumFeatureRelationship_Vars(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trench/Diaries
     */
    public static View get_Trench_Diaries(Solo solo) {
        String ref = "Trench/Diaries";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trench/FCNs
     */
    public static View get_Trench_FCNs(Solo solo) {
        String ref = "Trench/FCNs";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trench/Legacies
     */
    public static View get_Trench_Legacies(Solo solo) {
        String ref = "Trench/Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trench/Loci
     */
    public static View get_Trench_Loci(Solo solo) {
        String ref = "Trench/Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trench/Strata_Features
     */
    public static View get_Trench_StrataFeatures(Solo solo) {
        String ref = "Trench/Strata_Features";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trench/Trench
     */
    public static View get_Trench_Trench(Solo solo) {
        String ref = "Trench/Trench";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trench/Vars
     */
    public static View get_Trench_Vars(Solo solo) {
        String ref = "Trench/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trench_Files/Add_Trench_Files
     */
    public static View get_TrenchFiles_AddTrenchFiles(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Trench_Files/Vars
     */
    public static View get_TrenchFiles_Vars(Solo solo) {
        String ref = "Trench_Files/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User/Help
     */
    public static View get_User_Help(Solo solo) {
        String ref = "User/Help";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User/User_List
     */
    public static View get_User_UserList(Solo solo) {
        String ref = "User/User_List";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Site/Create_New_Site
     */
    public static View get_Control_Site_CreateNewSite(Solo solo) {
        String ref = "Control/Site/Create_New_Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Date_Closed/Date_Closed/Cancel
     */
    public static View get_DateClosed_DateClosed_Cancel(Solo solo) {
        String ref = "Date_Closed/Date_Closed/Cancel";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Date_Closed/Date_Closed/Set_Date_Closed
     */
    public static View get_DateClosed_DateClosed_SetDateClosed(Solo solo) {
        String ref = "Date_Closed/Date_Closed/Set_Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Diary/Diary/Photo_Button_1
     */
    public static View get_Diary_Diary_PhotoButton1(Solo solo) {
        String ref = "Diary/Diary/Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  FCN/General/Attach_File_Button_1
     */
    public static View get_FCN_General_AttachFileButton1(Solo solo) {
        String ref = "FCN/General/Attach_File_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  FCN/General/Attach_Photograph_Button_1
     */
    public static View get_FCN_General_AttachPhotographButton1(Solo solo) {
        String ref = "FCN/General/Attach_Photograph_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  FCN/General/Calculate_X_and_Y_values
     */
    public static View get_FCN_General_CalculateXandYvalues(Solo solo) {
        String ref = "FCN/General/Calculate_X_and_Y_values";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  FCN/General/Take_From_GPS_1
     */
    public static View get_FCN_General_TakeFromGPS1(Solo solo) {
        String ref = "FCN/General/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Add/Add_Photograph_Log
     */
    public static View get_Locus_Add_AddPhotographLog(Solo solo) {
        String ref = "Locus/Add/Add_Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Add/Attach_File_Button_1
     */
    public static View get_Locus_Add_AttachFileButton1(Solo solo) {
        String ref = "Locus/Add/Attach_File_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Add/Photo_Button_1
     */
    public static View get_Locus_Add_PhotoButton1(Solo solo) {
        String ref = "Locus/Add/Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Deposit/Add_Munsel_Color
     */
    public static View get_Locus_Deposit_AddMunselColor(Solo solo) {
        String ref = "Locus/Deposit/Add_Munsel_Color";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Deposit/Add_New_Sediment_Aggregate
     */
    public static View get_Locus_Deposit_AddNewSedimentAggregate(Solo solo) {
        String ref = "Locus/Deposit/Add_New_Sediment_Aggregate";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Deposit/Material_Helper
     */
    public static View get_Locus_Deposit_MaterialHelper(Solo solo) {
        String ref = "Locus/Deposit/Material_Helper";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/FCNs/Add_FCN
     */
    public static View get_Locus_FCNs_AddFCN(Solo solo) {
        String ref = "Locus/FCNs/Add_FCN";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/General/Add_Date_Closed
     */
    public static View get_Locus_General_AddDateClosed(Solo solo) {
        String ref = "Locus/General/Add_Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/General/Calculate_X_and_Y_values
     */
    public static View get_Locus_General_CalculateXandYvalues(Solo solo) {
        String ref = "Locus/General/Calculate_X_and_Y_values";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/General/Fill_in_Locus_Type_Details
     */
    public static View get_Locus_General_FillinLocusTypeDetails(Solo solo) {
        String ref = "Locus/General/Fill_in_Locus_Type_Details";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/General/Photo_of_Plan_Button_1
     */
    public static View get_Locus_General_PhotoofPlanButton1(Solo solo) {
        String ref = "Locus/General/Photo_of_Plan_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/General/Photo_of_Section_Button_1
     */
    public static View get_Locus_General_PhotoofSectionButton1(Solo solo) {
        String ref = "Locus/General/Photo_of_Section_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Material_Helper/Update_Material
     */
    public static View get_Locus_MaterialHelper_UpdateMaterial(Solo solo) {
        String ref = "Locus/Material_Helper/Update_Material";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Measure/Calculate_All_Elevations
     */
    public static View get_Locus_Measure_CalculateAllElevations(Solo solo) {
        String ref = "Locus/Measure/Calculate_All_Elevations";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Relationships/Create_Relationships_to_This_Locus
     */
    public static View get_Locus_Relationships_CreateRelationshipstoThisLocus(Solo solo) {
        String ref = "Locus/Relationships/Create_Relationships_to_This_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Relationships/Delete_Relationship
     */
    public static View get_Locus_Relationships_DeleteRelationship(Solo solo) {
        String ref = "Locus/Relationships/Delete_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Locus/Relationships/Load_Related_Locus
     */
    public static View get_Locus_Relationships_LoadRelatedLocus(Solo solo) {
        String ref = "Locus/Relationships/Load_Related_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Relationship/Legacies/Create_New_Legacy
     */
    public static View get_Relationship_Legacies_CreateNewLegacy(Solo solo) {
        String ref = "Relationship/Legacies/Create_New_Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Relationship/Relationships/Add_Relationship
     */
    public static View get_Relationship_Relationships_AddRelationship(Solo solo) {
        String ref = "Relationship/Relationships/Add_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Relationship/Relationships/Delete_Relationship
     */
    public static View get_Relationship_Relationships_DeleteRelationship(Solo solo) {
        String ref = "Relationship/Relationships/Delete_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Relationship/Relationships/Search
     */
    public static View get_Relationship_Relationships_Search(Solo solo) {
        String ref = "Relationship/Relationships/Search";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Site/Site/Create_New_Trench
     */
    public static View get_Site_Site_CreateNewTrench(Solo solo) {
        String ref = "Site/Site/Create_New_Trench";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature/Add/Add_Photograph_Log
     */
    public static View get_StratumFeature_Add_AddPhotographLog(Solo solo) {
        String ref = "Stratum_Feature/Add/Add_Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature/Add/Attach_File_Button_1
     */
    public static View get_StratumFeature_Add_AttachFileButton1(Solo solo) {
        String ref = "Stratum_Feature/Add/Attach_File_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature/Add/Photo_Button_1
     */
    public static View get_StratumFeature_Add_PhotoButton1(Solo solo) {
        String ref = "Stratum_Feature/Add/Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature/General/Calculate_All_Elevations
     */
    public static View get_StratumFeature_General_CalculateAllElevations(Solo solo) {
        String ref = "Stratum_Feature/General/Calculate_All_Elevations";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature/General/Calculate_X_and_Y_values
     */
    public static View get_StratumFeature_General_CalculateXandYvalues(Solo solo) {
        String ref = "Stratum_Feature/General/Calculate_X_and_Y_values";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature/Stratum_Feature_Loci/Create_Relationships_to_This_Stratum_Feature
     */
    public static View get_StratumFeature_StratumFeatureLoci_CreateRelationshipstoThisStratumFeature(Solo solo) {
        String ref = "Stratum_Feature/Stratum_Feature_Loci/Create_Relationships_to_This_Stratum_Feature";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature/Stratum_Feature_Loci/Delete_Relationship
     */
    public static View get_StratumFeature_StratumFeatureLoci_DeleteRelationship(Solo solo) {
        String ref = "Stratum_Feature/Stratum_Feature_Loci/Delete_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature/Stratum_Feature_Loci/Load_Related_Locus
     */
    public static View get_StratumFeature_StratumFeatureLoci_LoadRelatedLocus(Solo solo) {
        String ref = "Stratum_Feature/Stratum_Feature_Loci/Load_Related_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature_Relationship/Legacies/Create_New_Legacy
     */
    public static View get_StratumFeatureRelationship_Legacies_CreateNewLegacy(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Legacies/Create_New_Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature_Relationship/Relationships/Add_Relationship
     */
    public static View get_StratumFeatureRelationship_Relationships_AddRelationship(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Add_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature_Relationship/Relationships/Delete_Relationship
     */
    public static View get_StratumFeatureRelationship_Relationships_DeleteRelationship(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Delete_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Stratum_Feature_Relationship/Relationships/Search
     */
    public static View get_StratumFeatureRelationship_Relationships_Search(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Search";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench/Diaries/Create_New_Diary
     */
    public static View get_Trench_Diaries_CreateNewDiary(Solo solo) {
        String ref = "Trench/Diaries/Create_New_Diary";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench/FCNs/Create_New_FCN
     */
    public static View get_Trench_FCNs_CreateNewFCN(Solo solo) {
        String ref = "Trench/FCNs/Create_New_FCN";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench/Legacies/Create_New_Legacy
     */
    public static View get_Trench_Legacies_CreateNewLegacy(Solo solo) {
        String ref = "Trench/Legacies/Create_New_Legacy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench/Loci/Create_New_Locus
     */
    public static View get_Trench_Loci_CreateNewLocus(Solo solo) {
        String ref = "Trench/Loci/Create_New_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench/Strata_Features/Create_New_Stratum_Feature
     */
    public static View get_Trench_StrataFeatures_CreateNewStratumFeature(Solo solo) {
        String ref = "Trench/Strata_Features/Create_New_Stratum_Feature";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench/Trench/Add_Trench_Files
     */
    public static View get_Trench_Trench_AddTrenchFiles(Solo solo) {
        String ref = "Trench/Trench/Add_Trench_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench/Trench/Set_Date_Closed
     */
    public static View get_Trench_Trench_SetDateClosed(Solo solo) {
        String ref = "Trench/Trench/Set_Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench/Trench/Take_From_GPS_1
     */
    public static View get_Trench_Trench_TakeFromGPS1(Solo solo) {
        String ref = "Trench/Trench/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench_Files/Add_Trench_Files/Add_Photo_Button_1
     */
    public static View get_TrenchFiles_AddTrenchFiles_AddPhotoButton1(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/Add_Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Trench_Files/Add_Trench_Files/Attach_File_Button_1
     */
    public static View get_TrenchFiles_AddTrenchFiles_AttachFileButton1(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/Attach_File_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  User/User_List/Login
     */
    public static View get_User_UserList_Login(Solo solo) {
        String ref = "User/User_List/Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  User/User_List/Module_Guide
     */
    public static View get_User_UserList_ModuleGuide(Solo solo) {
        String ref = "User/User_List/Module_Guide";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Diary/Diary/Photo
     */
    public static View get_Diary_Diary_Photo(Solo solo) {
        String ref = "Diary/Diary/Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  FCN/General/Attach_Photograph
     */
    public static View get_FCN_General_AttachPhotograph(Solo solo) {
        String ref = "FCN/General/Attach_Photograph";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Locus/Add/Photo
     */
    public static View get_Locus_Add_Photo(Solo solo) {
        String ref = "Locus/Add/Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Locus/General/Photo_of_Plan
     */
    public static View get_Locus_General_PhotoofPlan(Solo solo) {
        String ref = "Locus/General/Photo_of_Plan";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Locus/General/Photo_of_Section
     */
    public static View get_Locus_General_PhotoofSection(Solo solo) {
        String ref = "Locus/General/Photo_of_Section";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Stratum_Feature/Add/Photo
     */
    public static View get_StratumFeature_Add_Photo(Solo solo) {
        String ref = "Stratum_Feature/Add/Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Trench_Files/Add_Trench_Files/Add_Photo
     */
    public static View get_TrenchFiles_AddTrenchFiles_AddPhoto(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/Add_Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Locus/General/Excavation_Method
     */
    public static View get_Locus_General_ExcavationMethod(Solo solo) {
        String ref = "Locus/General/Excavation_Method";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Trench/Trench/Excavation_Method
     */
    public static View get_Trench_Trench_ExcavationMethod(Solo solo) {
        String ref = "Trench/Trench/Excavation_Method";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Search/Entity_Types
     */
    public static View get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Diary/Vars/Device_Code
     */
    public static View get_Diary_Vars_DeviceCode(Solo solo) {
        String ref = "Diary/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  FCN/General/Collection_Method
     */
    public static View get_FCN_General_CollectionMethod(Solo solo) {
        String ref = "FCN/General/Collection_Method";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  FCN/General/FCN_Class
     */
    public static View get_FCN_General_FCNClass(Solo solo) {
        String ref = "FCN/General/FCN_Class";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  FCN/General/FCN_Quantity
     */
    public static View get_FCN_General_FCNQuantity(Solo solo) {
        String ref = "FCN/General/FCN_Quantity";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  FCN/Vars/Device_Code
     */
    public static View get_FCN_Vars_DeviceCode(Solo solo) {
        String ref = "FCN/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Legacy/Var/Device_Code
     */
    public static View get_Legacy_Var_DeviceCode(Solo solo) {
        String ref = "Legacy/Var/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Add/Select_a_Photograph_Log
     */
    public static View get_Locus_Add_SelectaPhotographLog(Solo solo) {
        String ref = "Locus/Add/Select_a_Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Inclination_of_axis
     */
    public static View get_Locus_Cut_Inclinationofaxis(Solo solo) {
        String ref = "Locus/Cut/Inclination_of_axis";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Orientation
     */
    public static View get_Locus_Cut_Orientation(Solo solo) {
        String ref = "Locus/Cut/Orientation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Shape_in_Plan
     */
    public static View get_Locus_Cut_ShapeinPlan(Solo solo) {
        String ref = "Locus/Cut/Shape_in_Plan";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Shape_of_Base
     */
    public static View get_Locus_Cut_ShapeofBase(Solo solo) {
        String ref = "Locus/Cut/Shape_of_Base";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Sides_of_Cut
     */
    public static View get_Locus_Cut_SidesofCut(Solo solo) {
        String ref = "Locus/Cut/Sides_of_Cut";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Cut/Your_Identification_Type_of_Cut
     */
    public static View get_Locus_Cut_YourIdentificationTypeofCut(Solo solo) {
        String ref = "Locus/Cut/Your_Identification_Type_of_Cut";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Associated_Sediment_Aggregates
     */
    public static View get_Locus_Deposit_AssociatedSedimentAggregates(Solo solo) {
        String ref = "Locus/Deposit/Associated_Sediment_Aggregates";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Composition_Type
     */
    public static View get_Locus_Deposit_CompositionType(Solo solo) {
        String ref = "Locus/Deposit/Composition_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Deposit_Bedding
     */
    public static View get_Locus_Deposit_DepositBedding(Solo solo) {
        String ref = "Locus/Deposit/Deposit_Bedding";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Material
     */
    public static View get_Locus_Deposit_Material(Solo solo) {
        String ref = "Locus/Deposit/Material";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Munsel_Colors
     */
    public static View get_Locus_Deposit_MunselColors(Solo solo) {
        String ref = "Locus/Deposit/Munsel_Colors";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Texture
     */
    public static View get_Locus_Deposit_Texture(Solo solo) {
        String ref = "Locus/Deposit/Texture";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Deposit/Your_Identification_Type_of_Deposit
     */
    public static View get_Locus_Deposit_YourIdentificationTypeofDeposit(Solo solo) {
        String ref = "Locus/Deposit/Your_Identification_Type_of_Deposit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/General/Basal_Edge_Definition
     */
    public static View get_Locus_General_BasalEdgeDefinition(Solo solo) {
        String ref = "Locus/General/Basal_Edge_Definition";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/General/Contamination
     */
    public static View get_Locus_General_Contamination(Solo solo) {
        String ref = "Locus/General/Contamination";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Material_Helper/Material_Helper
     */
    public static View get_Locus_MaterialHelper_MaterialHelper(Solo solo) {
        String ref = "Locus/Material_Helper/Material_Helper";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Locus/Vars/Device_Code
     */
    public static View get_Locus_Vars_DeviceCode(Solo solo) {
        String ref = "Locus/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Photograph_Log/Photograph_Log/Scene_Type
     */
    public static View get_PhotographLog_PhotographLog_SceneType(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Scene_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Photograph_Log/Vars/Device_Code
     */
    public static View get_PhotographLog_Vars_DeviceCode(Solo solo) {
        String ref = "Photograph_Log/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Relationship/Relationships/Relationship_Type
     */
    public static View get_Relationship_Relationships_RelationshipType(Solo solo) {
        String ref = "Relationship/Relationships/Relationship_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Sediment_Aggregate/Sediment_Aggregate/Component_Type
     */
    public static View get_SedimentAggregate_SedimentAggregate_ComponentType(Solo solo) {
        String ref = "Sediment_Aggregate/Sediment_Aggregate/Component_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Sediment_Aggregate/Vars/Device_Code
     */
    public static View get_SedimentAggregate_Vars_DeviceCode(Solo solo) {
        String ref = "Sediment_Aggregate/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Site/Vars/Device_Code
     */
    public static View get_Site_Vars_DeviceCode(Solo solo) {
        String ref = "Site/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Soil_Munsel_Color/Add_Soil_Munsel_Color/Soil_Munsel_Color
     */
    public static View get_SoilMunselColor_AddSoilMunselColor_SoilMunselColor(Solo solo) {
        String ref = "Soil_Munsel_Color/Add_Soil_Munsel_Color/Soil_Munsel_Color";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Soil_Munsel_Color/Vars/Device_Code
     */
    public static View get_SoilMunselColor_Vars_DeviceCode(Solo solo) {
        String ref = "Soil_Munsel_Color/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Stratum_Feature/Add/Select_a_Photograph_Log
     */
    public static View get_StratumFeature_Add_SelectaPhotographLog(Solo solo) {
        String ref = "Stratum_Feature/Add/Select_a_Photograph_Log";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Stratum_Feature/Vars/Device_Code
     */
    public static View get_StratumFeature_Vars_DeviceCode(Solo solo) {
        String ref = "Stratum_Feature/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Stratum_Feature/Vars/Last_Feature_Type
     */
    public static View get_StratumFeature_Vars_LastFeatureType(Solo solo) {
        String ref = "Stratum_Feature/Vars/Last_Feature_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Trench/Trench/Attached_Trench_Files
     */
    public static View get_Trench_Trench_AttachedTrenchFiles(Solo solo) {
        String ref = "Trench/Trench/Attached_Trench_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Trench/Trench/Trench_Dimension_1_m
     */
    public static View get_Trench_Trench_TrenchDimension1m(Solo solo) {
        String ref = "Trench/Trench/Trench_Dimension_1_m";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Trench/Trench/Trench_Dimension_2_m
     */
    public static View get_Trench_Trench_TrenchDimension2m(Solo solo) {
        String ref = "Trench/Trench/Trench_Dimension_2_m";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Trench/Vars/Device_Code
     */
    public static View get_Trench_Vars_DeviceCode(Solo solo) {
        String ref = "Trench/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Trench_Files/Add_Trench_Files/File_Type
     */
    public static View get_TrenchFiles_AddTrenchFiles_FileType(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/File_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Trench_Files/Vars/Device_Code
     */
    public static View get_TrenchFiles_Vars_DeviceCode(Solo solo) {
        String ref = "Trench_Files/Vars/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  User/User_List/Device_Code
     */
    public static View get_User_UserList_DeviceCode(Solo solo) {
        String ref = "User/User_List/Device_Code";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  User/User_List/Users
     */
    public static View get_User_UserList_Users(Solo solo) {
        String ref = "User/User_List/Users";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: file
        Ref:  FCN/General/Attach_File
     */
    public static View get_FCN_General_AttachFile(Solo solo) {
        String ref = "FCN/General/Attach_File";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: file
        Ref:  Locus/Add/Attach_File
     */
    public static View get_Locus_Add_AttachFile(Solo solo) {
        String ref = "Locus/Add/Attach_File";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: file
        Ref:  Stratum_Feature/Add/Attach_File
     */
    public static View get_StratumFeature_Add_AttachFile(Solo solo) {
        String ref = "Stratum_Feature/Add/Attach_File";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: file
        Ref:  Trench_Files/Add_Trench_Files/Attach_File
     */
    public static View get_TrenchFiles_AddTrenchFiles_AttachFile(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/Attach_File";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: gpsdiag
        Ref:  Control/Site/GPS_Diagnostics
     */
    public static View get_Control_Site_GPSDiagnostics(Solo solo) {
        String ref = "Control/Site/GPS_Diagnostics";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Next_IDs/Next_FCN_ID
     */
    public static EditText get_Control_NextIDs_NextFCNID(Solo solo) {
        String ref = "Control/Next_IDs/Next_FCN_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Next_IDs/Next_Stratum_Feature_ID
     */
    public static EditText get_Control_NextIDs_NextStratumFeatureID(Solo solo) {
        String ref = "Control/Next_IDs/Next_Stratum_Feature_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Site/New_Site_Name
     */
    public static EditText get_Control_Site_NewSiteName(Solo solo) {
        String ref = "Control/Site/New_Site_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Site/Year_of_Campaign
     */
    public static EditText get_Control_Site_YearofCampaign(Solo solo) {
        String ref = "Control/Site/Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Date_Closed/Date_Closed/Date_Closed
     */
    public static EditText get_DateClosed_DateClosed_DateClosed(Solo solo) {
        String ref = "Date_Closed/Date_Closed/Date_Closed";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Diary/Text
     */
    public static EditText get_Diary_Diary_Text(Solo solo) {
        String ref = "Diary/Diary/Text";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Diary/Timestamp
     */
    public static View get_Diary_Diary_Timestamp(Solo solo) {
        String ref = "Diary/Diary/Timestamp";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Diary/Title
     */
    public static EditText get_Diary_Diary_Title(Solo solo) {
        String ref = "Diary/Diary/Title";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Vars/Diary_Site_Name
     */
    public static EditText get_Diary_Vars_DiarySiteName(Solo solo) {
        String ref = "Diary/Vars/Diary_Site_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Vars/Diary_Trench_ID
     */
    public static EditText get_Diary_Vars_DiaryTrenchID(Solo solo) {
        String ref = "Diary/Vars/Diary_Trench_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Diary/Vars/Diary_Year_of_Campaign
     */
    public static EditText get_Diary_Vars_DiaryYearofCampaign(Solo solo) {
        String ref = "Diary/Vars/Diary_Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/Accuracy
     */
    public static View get_FCN_General_Accuracy(Solo solo) {
        String ref = "FCN/General/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/Easting
     */
    public static View get_FCN_General_Easting(Solo solo) {
        String ref = "FCN/General/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/FCN_Group_Comment
     */
    public static EditText get_FCN_General_FCNGroupComment(Solo solo) {
        String ref = "FCN/General/FCN_Group_Comment";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/FCN_ID
     */
    public static EditText get_FCN_General_FCNID(Solo solo) {
        String ref = "FCN/General/FCN_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/FCN_Site_Name
     */
    public static View get_FCN_General_FCNSiteName(Solo solo) {
        String ref = "FCN/General/FCN_Site_Name";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/FCN_Trench_ID
     */
    public static View get_FCN_General_FCNTrenchID(Solo solo) {
        String ref = "FCN/General/FCN_Trench_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/FCN_Weight_g
     */
    public static EditText get_FCN_General_FCNWeightg(Solo solo) {
        String ref = "FCN/General/FCN_Weight_g";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/FCN_X_Calculated
     */
    public static EditText get_FCN_General_FCNXCalculated(Solo solo) {
        String ref = "FCN/General/FCN_X_Calculated";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/FCN_X_Dimension_m
     */
    public static EditText get_FCN_General_FCNXDimensionm(Solo solo) {
        String ref = "FCN/General/FCN_X_Dimension_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/FCN_Y_Calculated
     */
    public static EditText get_FCN_General_FCNYCalculated(Solo solo) {
        String ref = "FCN/General/FCN_Y_Calculated";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/FCN_Y_Dimension_m
     */
    public static EditText get_FCN_General_FCNYDimensionm(Solo solo) {
        String ref = "FCN/General/FCN_Y_Dimension_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/Latitude
     */
    public static View get_FCN_General_Latitude(Solo solo) {
        String ref = "FCN/General/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/Locus_ID
     */
    public static View get_FCN_General_LocusID(Solo solo) {
        String ref = "FCN/General/Locus_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/Longitude
     */
    public static View get_FCN_General_Longitude(Solo solo) {
        String ref = "FCN/General/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/General/Northing
     */
    public static View get_FCN_General_Northing(Solo solo) {
        String ref = "FCN/General/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  FCN/Vars/FCN_Year_of_Campaign
     */
    public static EditText get_FCN_Vars_FCNYearofCampaign(Solo solo) {
        String ref = "FCN/Vars/FCN_Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Legacy/Legacy/Legacy_Locus_ID
     */
    public static EditText get_Legacy_Legacy_LegacyLocusID(Solo solo) {
        String ref = "Legacy/Legacy/Legacy_Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Legacy/Legacy/Legacy_Site_Name
     */
    public static View get_Legacy_Legacy_LegacySiteName(Solo solo) {
        String ref = "Legacy/Legacy/Legacy_Site_Name";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Legacy/Legacy/Legacy_Trench_ID
     */
    public static EditText get_Legacy_Legacy_LegacyTrenchID(Solo solo) {
        String ref = "Legacy/Legacy/Legacy_Trench_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Legacy/Legacy/Legacy_Year_of_Campaign
     */
    public static EditText get_Legacy_Legacy_LegacyYearofCampaign(Solo solo) {
        String ref = "Legacy/Legacy/Legacy_Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Center_Bottom_Depth
     */
    public static EditText get_Locus_Construction_CenterBottomDepth(Solo solo) {
        String ref = "Locus/Construction/Center_Bottom_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Center_Top_Depth
     */
    public static EditText get_Locus_Construction_CenterTopDepth(Solo solo) {
        String ref = "Locus/Construction/Center_Top_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Length
     */
    public static EditText get_Locus_Construction_Length(Solo solo) {
        String ref = "Locus/Construction/Length";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Mid_X
     */
    public static EditText get_Locus_Construction_MidX(Solo solo) {
        String ref = "Locus/Construction/Mid_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Mid_Y
     */
    public static EditText get_Locus_Construction_MidY(Solo solo) {
        String ref = "Locus/Construction/Mid_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/NE_Bottom_Depth
     */
    public static EditText get_Locus_Construction_NEBottomDepth(Solo solo) {
        String ref = "Locus/Construction/NE_Bottom_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/NE_Top_Depth
     */
    public static EditText get_Locus_Construction_NETopDepth(Solo solo) {
        String ref = "Locus/Construction/NE_Top_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/NW_Bottom_Depth
     */
    public static EditText get_Locus_Construction_NWBottomDepth(Solo solo) {
        String ref = "Locus/Construction/NW_Bottom_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/NW_Top_Depth
     */
    public static EditText get_Locus_Construction_NWTopDepth(Solo solo) {
        String ref = "Locus/Construction/NW_Top_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Notes
     */
    public static EditText get_Locus_Construction_Notes(Solo solo) {
        String ref = "Locus/Construction/Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Plans
     */
    public static EditText get_Locus_Construction_Plans(Solo solo) {
        String ref = "Locus/Construction/Plans";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/SE_Bottom_Depth
     */
    public static EditText get_Locus_Construction_SEBottomDepth(Solo solo) {
        String ref = "Locus/Construction/SE_Bottom_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/SE_Top_Depth
     */
    public static EditText get_Locus_Construction_SETopDepth(Solo solo) {
        String ref = "Locus/Construction/SE_Top_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/SW_Bottom_Depth
     */
    public static EditText get_Locus_Construction_SWBottomDepth(Solo solo) {
        String ref = "Locus/Construction/SW_Bottom_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/SW_Top_Depth
     */
    public static EditText get_Locus_Construction_SWTopDepth(Solo solo) {
        String ref = "Locus/Construction/SW_Top_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Section_Numbers
     */
    public static EditText get_Locus_Construction_SectionNumbers(Solo solo) {
        String ref = "Locus/Construction/Section_Numbers";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Sorting
     */
    public static EditText get_Locus_Construction_Sorting(Solo solo) {
        String ref = "Locus/Construction/Sorting";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Construction/Width
     */
    public static EditText get_Locus_Construction_Width(Solo solo) {
        String ref = "Locus/Construction/Width";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Cut/Orientation_Degree
     */
    public static EditText get_Locus_Cut_OrientationDegree(Solo solo) {
        String ref = "Locus/Cut/Orientation_Degree";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Cut/Shape_of_Cut_-_Note
     */
    public static EditText get_Locus_Cut_ShapeofCutNote(Solo solo) {
        String ref = "Locus/Cut/Shape_of_Cut_-_Note";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Cut/Truncation
     */
    public static EditText get_Locus_Cut_Truncation(Solo solo) {
        String ref = "Locus/Cut/Truncation";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Deposit/Deposit_Inclusions
     */
    public static EditText get_Locus_Deposit_DepositInclusions(Solo solo) {
        String ref = "Locus/Deposit/Deposit_Inclusions";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Deposit/Soil_Colour
     */
    public static EditText get_Locus_Deposit_SoilColour(Solo solo) {
        String ref = "Locus/Deposit/Soil_Colour";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Deposit/Texture_Description
     */
    public static EditText get_Locus_Deposit_TextureDescription(Solo solo) {
        String ref = "Locus/Deposit/Texture_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Brief_Description
     */
    public static EditText get_Locus_General_BriefDescription(Solo solo) {
        String ref = "Locus/General/Brief_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Date_Closed
     */
    public static EditText get_Locus_General_DateClosed(Solo solo) {
        String ref = "Locus/General/Date_Closed";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Date_Opened
     */
    public static EditText get_Locus_General_DateOpened(Solo solo) {
        String ref = "Locus/General/Date_Opened";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Locus_Locus_ID
     */
    public static EditText get_Locus_General_LocusLocusID(Solo solo) {
        String ref = "Locus/General/Locus_Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Locus_Mid_X_Dimension_m
     */
    public static EditText get_Locus_General_LocusMidXDimensionm(Solo solo) {
        String ref = "Locus/General/Locus_Mid_X_Dimension_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Locus_Mid_Y_Dimension_m
     */
    public static EditText get_Locus_General_LocusMidYDimensionm(Solo solo) {
        String ref = "Locus/General/Locus_Mid_Y_Dimension_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Locus_Site_Name
     */
    public static EditText get_Locus_General_LocusSiteName(Solo solo) {
        String ref = "Locus/General/Locus_Site_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Locus_Trench_ID
     */
    public static View get_Locus_General_LocusTrenchID(Solo solo) {
        String ref = "Locus/General/Locus_Trench_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Locus_X_Calculated
     */
    public static EditText get_Locus_General_LocusXCalculated(Solo solo) {
        String ref = "Locus/General/Locus_X_Calculated";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Locus_Y_Calculated
     */
    public static EditText get_Locus_General_LocusYCalculated(Solo solo) {
        String ref = "Locus/General/Locus_Y_Calculated";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/General/Team_Members
     */
    public static EditText get_Locus_General_TeamMembers(Solo solo) {
        String ref = "Locus/General/Team_Members";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Int/Your_Interpretation_Discussion
     */
    public static EditText get_Locus_Int_YourInterpretationDiscussion(Solo solo) {
        String ref = "Locus/Int/Your_Interpretation_Discussion";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Absolute_Height_Bottom_Dim_m
     */
    public static EditText get_Locus_Measure_AbsoluteHeightBottomDimm(Solo solo) {
        String ref = "Locus/Measure/Absolute_Height_Bottom_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Absolute_Height_Top_Dim_m
     */
    public static EditText get_Locus_Measure_AbsoluteHeightTopDimm(Solo solo) {
        String ref = "Locus/Measure/Absolute_Height_Top_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Centre_Bottom_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_CentreBottomElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/Centre_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Centre_Bottom_Height_Dim_m
     */
    public static EditText get_Locus_Measure_CentreBottomHeightDimm(Solo solo) {
        String ref = "Locus/Measure/Centre_Bottom_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Centre_Top_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_CentreTopElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/Centre_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Centre_Top_Height_Dim_m
     */
    public static EditText get_Locus_Measure_CentreTopHeightDimm(Solo solo) {
        String ref = "Locus/Measure/Centre_Top_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Elevation_Bottom_Calc_m
     */
    public static EditText get_Locus_Measure_ElevationBottomCalcm(Solo solo) {
        String ref = "Locus/Measure/Elevation_Bottom_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Elevation_Top_Calc_m
     */
    public static EditText get_Locus_Measure_ElevationTopCalcm(Solo solo) {
        String ref = "Locus/Measure/Elevation_Top_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Measure_Depth
     */
    public static EditText get_Locus_Measure_MeasureDepth(Solo solo) {
        String ref = "Locus/Measure/Measure_Depth";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Measure_Length
     */
    public static EditText get_Locus_Measure_MeasureLength(Solo solo) {
        String ref = "Locus/Measure/Measure_Length";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Measure_Width
     */
    public static EditText get_Locus_Measure_MeasureWidth(Solo solo) {
        String ref = "Locus/Measure/Measure_Width";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NE_Bottom_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_NEBottomElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/NE_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NE_Bottom_Height_Dim_m
     */
    public static EditText get_Locus_Measure_NEBottomHeightDimm(Solo solo) {
        String ref = "Locus/Measure/NE_Bottom_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NE_Top_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_NETopElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/NE_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NE_Top_Height_Dim_m
     */
    public static EditText get_Locus_Measure_NETopHeightDimm(Solo solo) {
        String ref = "Locus/Measure/NE_Top_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NW_Bottom_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_NWBottomElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/NW_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NW_Bottom_Height_Dim_m
     */
    public static EditText get_Locus_Measure_NWBottomHeightDimm(Solo solo) {
        String ref = "Locus/Measure/NW_Bottom_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NW_Top_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_NWTopElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/NW_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/NW_Top_Height_Dim_m
     */
    public static EditText get_Locus_Measure_NWTopHeightDimm(Solo solo) {
        String ref = "Locus/Measure/NW_Top_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SE_Bottom_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_SEBottomElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/SE_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SE_Bottom_Height_Dim_m
     */
    public static EditText get_Locus_Measure_SEBottomHeightDimm(Solo solo) {
        String ref = "Locus/Measure/SE_Bottom_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SE_Top_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_SETopElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/SE_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SE_Top_Height_Dim_m
     */
    public static EditText get_Locus_Measure_SETopHeightDimm(Solo solo) {
        String ref = "Locus/Measure/SE_Top_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SW_Bottom_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_SWBottomElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/SW_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SW_Bottom_Height_Dim_m
     */
    public static EditText get_Locus_Measure_SWBottomHeightDimm(Solo solo) {
        String ref = "Locus/Measure/SW_Bottom_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SW_Top_Elevation_Calc_m
     */
    public static EditText get_Locus_Measure_SWTopElevationCalcm(Solo solo) {
        String ref = "Locus/Measure/SW_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/SW_Top_Height_Dim_m
     */
    public static EditText get_Locus_Measure_SWTopHeightDimm(Solo solo) {
        String ref = "Locus/Measure/SW_Top_Height_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Measure/Volume_Liters
     */
    public static EditText get_Locus_Measure_VolumeLiters(Solo solo) {
        String ref = "Locus/Measure/Volume_Liters";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Location
     */
    public static EditText get_Locus_Skeleton_Location(Solo solo) {
        String ref = "Locus/Skeleton/Location";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Body
     */
    public static EditText get_Locus_Skeleton_SkeletonBody(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Body";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Condition
     */
    public static EditText get_Locus_Skeleton_SkeletonCondition(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Condition";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Days_Exposed
     */
    public static EditText get_Locus_Skeleton_SkeletonDaysExposed(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Days_Exposed";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Dimensions
     */
    public static EditText get_Locus_Skeleton_SkeletonDimensions(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Dimensions";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Environment
     */
    public static EditText get_Locus_Skeleton_SkeletonEnvironment(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Environment";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Head
     */
    public static EditText get_Locus_Skeleton_SkeletonHead(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Head";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Left_Arm
     */
    public static EditText get_Locus_Skeleton_SkeletonLeftArm(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Left_Arm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Left_Leg
     */
    public static EditText get_Locus_Skeleton_SkeletonLeftLeg(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Left_Leg";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Notes
     */
    public static EditText get_Locus_Skeleton_SkeletonNotes(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Right_Arm
     */
    public static EditText get_Locus_Skeleton_SkeletonRightArm(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Right_Arm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Right_Leg
     */
    public static EditText get_Locus_Skeleton_SkeletonRightLeg(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Right_Leg";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Skeleton_Surface_Modifications
     */
    public static EditText get_Locus_Skeleton_SkeletonSurfaceModifications(Solo solo) {
        String ref = "Locus/Skeleton/Skeleton_Surface_Modifications";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_A_X
     */
    public static EditText get_Locus_Skeleton_TargetAX(Solo solo) {
        String ref = "Locus/Skeleton/Target_A_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_A_Y
     */
    public static EditText get_Locus_Skeleton_TargetAY(Solo solo) {
        String ref = "Locus/Skeleton/Target_A_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_A_Z
     */
    public static EditText get_Locus_Skeleton_TargetAZ(Solo solo) {
        String ref = "Locus/Skeleton/Target_A_Z";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_B_X
     */
    public static EditText get_Locus_Skeleton_TargetBX(Solo solo) {
        String ref = "Locus/Skeleton/Target_B_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_B_Y
     */
    public static EditText get_Locus_Skeleton_TargetBY(Solo solo) {
        String ref = "Locus/Skeleton/Target_B_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_B_Z
     */
    public static EditText get_Locus_Skeleton_TargetBZ(Solo solo) {
        String ref = "Locus/Skeleton/Target_B_Z";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_C_X
     */
    public static EditText get_Locus_Skeleton_TargetCX(Solo solo) {
        String ref = "Locus/Skeleton/Target_C_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_C_Y
     */
    public static EditText get_Locus_Skeleton_TargetCY(Solo solo) {
        String ref = "Locus/Skeleton/Target_C_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_C_Z
     */
    public static EditText get_Locus_Skeleton_TargetCZ(Solo solo) {
        String ref = "Locus/Skeleton/Target_C_Z";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_D_X
     */
    public static EditText get_Locus_Skeleton_TargetDX(Solo solo) {
        String ref = "Locus/Skeleton/Target_D_X";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_D_Y
     */
    public static EditText get_Locus_Skeleton_TargetDY(Solo solo) {
        String ref = "Locus/Skeleton/Target_D_Y";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Skeleton/Target_D_Z
     */
    public static EditText get_Locus_Skeleton_TargetDZ(Solo solo) {
        String ref = "Locus/Skeleton/Target_D_Z";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Vars/Locus_SW_Corner_Elevation_m
     */
    public static EditText get_Locus_Vars_LocusSWCornerElevationm(Solo solo) {
        String ref = "Locus/Vars/Locus_SW_Corner_Elevation_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Locus/Vars/Locus_Year_of_Campaign
     */
    public static EditText get_Locus_Vars_LocusYearofCampaign(Solo solo) {
        String ref = "Locus/Vars/Locus_Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Photograph_Log/Brief_Description
     */
    public static EditText get_PhotographLog_PhotographLog_BriefDescription(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Brief_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Photograph_Log/Photo_Locus_ID
     */
    public static View get_PhotographLog_PhotographLog_PhotoLocusID(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Photo_Locus_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Photograph_Log/Photo_Stratum_Feature_ID
     */
    public static View get_PhotographLog_PhotographLog_PhotoStratumFeatureID(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Photo_Stratum_Feature_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Photograph_Log/Photograph_Reference_ID
     */
    public static EditText get_PhotographLog_PhotographLog_PhotographReferenceID(Solo solo) {
        String ref = "Photograph_Log/Photograph_Log/Photograph_Reference_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Vars/Photograph_Log_Site_Name
     */
    public static EditText get_PhotographLog_Vars_PhotographLogSiteName(Solo solo) {
        String ref = "Photograph_Log/Vars/Photograph_Log_Site_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Vars/Photograph_Log_Year_of_Campaign
     */
    public static EditText get_PhotographLog_Vars_PhotographLogYearofCampaign(Solo solo) {
        String ref = "Photograph_Log/Vars/Photograph_Log_Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Photograph_Log/Vars/Photograph_Trench_ID
     */
    public static EditText get_PhotographLog_Vars_PhotographTrenchID(Solo solo) {
        String ref = "Photograph_Log/Vars/Photograph_Trench_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Relationship/Relationships/Locus_ID
     */
    public static EditText get_Relationship_Relationships_LocusID(Solo solo) {
        String ref = "Relationship/Relationships/Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Relationship/Relationships/Trench_ID
     */
    public static EditText get_Relationship_Relationships_TrenchID(Solo solo) {
        String ref = "Relationship/Relationships/Trench_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Relationship/Vars/Relationship_Site_Name
     */
    public static EditText get_Relationship_Vars_RelationshipSiteName(Solo solo) {
        String ref = "Relationship/Vars/Relationship_Site_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Relationship/Vars/Relationship_Year_of_Campaign
     */
    public static EditText get_Relationship_Vars_RelationshipYearofCampaign(Solo solo) {
        String ref = "Relationship/Vars/Relationship_Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sediment_Aggregate/Sediment_Aggregate/Percentage
     */
    public static EditText get_SedimentAggregate_SedimentAggregate_Percentage(Solo solo) {
        String ref = "Sediment_Aggregate/Sediment_Aggregate/Percentage";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sediment_Aggregate/Vars/Locus_ID
     */
    public static EditText get_SedimentAggregate_Vars_LocusID(Solo solo) {
        String ref = "Sediment_Aggregate/Vars/Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Sediment_Aggregate/Vars/Trench_ID
     */
    public static EditText get_SedimentAggregate_Vars_TrenchID(Solo solo) {
        String ref = "Sediment_Aggregate/Vars/Trench_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site/Site_Site_Name
     */
    public static View get_Site_Site_SiteSiteName(Solo solo) {
        String ref = "Site/Site/Site_Site_Name";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site/Site_Year_of_Campaign
     */
    public static View get_Site_Site_SiteYearofCampaign(Solo solo) {
        String ref = "Site/Site/Site_Year_of_Campaign";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site/Trench_ID
     */
    public static EditText get_Site_Site_TrenchID(Solo solo) {
        String ref = "Site/Site/Trench_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Soil_Munsel_Color/Vars/Soil_Munsel_Color_Locus_ID
     */
    public static EditText get_SoilMunselColor_Vars_SoilMunselColorLocusID(Solo solo) {
        String ref = "Soil_Munsel_Color/Vars/Soil_Munsel_Color_Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Center_Top_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_CenterTopDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/Center_Top_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Center_Top_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_CenterTopElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/Center_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Centre_Bottom_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_CentreBottomDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/Centre_Bottom_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Centre_Bottom_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_CentreBottomElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/Centre_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Description
     */
    public static EditText get_StratumFeature_General_Description(Solo solo) {
        String ref = "Stratum_Feature/General/Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Discussion
     */
    public static EditText get_StratumFeature_General_Discussion(Solo solo) {
        String ref = "Stratum_Feature/General/Discussion";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Interpretation
     */
    public static EditText get_StratumFeature_General_Interpretation(Solo solo) {
        String ref = "Stratum_Feature/General/Interpretation";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Length
     */
    public static EditText get_StratumFeature_General_Length(Solo solo) {
        String ref = "Stratum_Feature/General/Length";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/NE_Bottom_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_NEBottomDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/NE_Bottom_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/NE_Bottom_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_NEBottomElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/NE_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/NE_Top_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_NETopDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/NE_Top_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/NE_Top_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_NETopElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/NE_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/NW_Bottom_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_NWBottomDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/NW_Bottom_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/NW_Bottom_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_NWBottomElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/NW_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/NW_Top_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_NWTopDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/NW_Top_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/NW_Top_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_NWTopElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/NW_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Plans
     */
    public static EditText get_StratumFeature_General_Plans(Solo solo) {
        String ref = "Stratum_Feature/General/Plans";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Preliminary_Cultural_Association
     */
    public static EditText get_StratumFeature_General_PreliminaryCulturalAssociation(Solo solo) {
        String ref = "Stratum_Feature/General/Preliminary_Cultural_Association";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/SE_Bottom_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_SEBottomDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/SE_Bottom_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/SE_Bottom_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_SEBottomElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/SE_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/SE_Top_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_SETopDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/SE_Top_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/SE_Top_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_SETopElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/SE_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/SW_Bottom_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_SWBottomDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/SW_Bottom_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/SW_Bottom_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_SWBottomElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/SW_Bottom_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/SW_Top_Depth_Dim_m
     */
    public static EditText get_StratumFeature_General_SWTopDepthDimm(Solo solo) {
        String ref = "Stratum_Feature/General/SW_Top_Depth_Dim_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/SW_Top_Elevation_Calc_m
     */
    public static EditText get_StratumFeature_General_SWTopElevationCalcm(Solo solo) {
        String ref = "Stratum_Feature/General/SW_Top_Elevation_Calc_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Section_Numbers
     */
    public static EditText get_StratumFeature_General_SectionNumbers(Solo solo) {
        String ref = "Stratum_Feature/General/Section_Numbers";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Stratum_Feature_ID
     */
    public static EditText get_StratumFeature_General_StratumFeatureID(Solo solo) {
        String ref = "Stratum_Feature/General/Stratum_Feature_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Stratum_Feature_Mid_X_Calculated
     */
    public static EditText get_StratumFeature_General_StratumFeatureMidXCalculated(Solo solo) {
        String ref = "Stratum_Feature/General/Stratum_Feature_Mid_X_Calculated";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Stratum_Feature_Mid_X_Dimension_m
     */
    public static EditText get_StratumFeature_General_StratumFeatureMidXDimensionm(Solo solo) {
        String ref = "Stratum_Feature/General/Stratum_Feature_Mid_X_Dimension_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Stratum_Feature_Mid_Y_Calculated
     */
    public static EditText get_StratumFeature_General_StratumFeatureMidYCalculated(Solo solo) {
        String ref = "Stratum_Feature/General/Stratum_Feature_Mid_Y_Calculated";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Stratum_Feature_Mid_Y_Dimension_m
     */
    public static EditText get_StratumFeature_General_StratumFeatureMidYDimensionm(Solo solo) {
        String ref = "Stratum_Feature/General/Stratum_Feature_Mid_Y_Dimension_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Stratum_Feature_Trench_ID
     */
    public static View get_StratumFeature_General_StratumFeatureTrenchID(Solo solo) {
        String ref = "Stratum_Feature/General/Stratum_Feature_Trench_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/General/Width
     */
    public static EditText get_StratumFeature_General_Width(Solo solo) {
        String ref = "Stratum_Feature/General/Width";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/Vars/L_Paren
     */
    public static EditText get_StratumFeature_Vars_LParen(Solo solo) {
        String ref = "Stratum_Feature/Vars/L_Paren";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/Vars/Last_Feature_Prefix
     */
    public static EditText get_StratumFeature_Vars_LastFeaturePrefix(Solo solo) {
        String ref = "Stratum_Feature/Vars/Last_Feature_Prefix";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/Vars/R_Paren
     */
    public static EditText get_StratumFeature_Vars_RParen(Solo solo) {
        String ref = "Stratum_Feature/Vars/R_Paren";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/Vars/Stratum_Feature_SW_Corner_Elevation_m
     */
    public static EditText get_StratumFeature_Vars_StratumFeatureSWCornerElevationm(Solo solo) {
        String ref = "Stratum_Feature/Vars/Stratum_Feature_SW_Corner_Elevation_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/Vars/Stratum_Feature_Site_Name
     */
    public static EditText get_StratumFeature_Vars_StratumFeatureSiteName(Solo solo) {
        String ref = "Stratum_Feature/Vars/Stratum_Feature_Site_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature/Vars/Stratum_Feature_Year_of_Campaign
     */
    public static EditText get_StratumFeature_Vars_StratumFeatureYearofCampaign(Solo solo) {
        String ref = "Stratum_Feature/Vars/Stratum_Feature_Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature_Relationship/Relationships/Locus_ID
     */
    public static EditText get_StratumFeatureRelationship_Relationships_LocusID(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Locus_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature_Relationship/Relationships/Trench_ID
     */
    public static EditText get_StratumFeatureRelationship_Relationships_TrenchID(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Trench_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature_Relationship/Vars/Stratum_Feature_Relationship_Site_Name
     */
    public static EditText get_StratumFeatureRelationship_Vars_StratumFeatureRelationshipSiteName(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Vars/Stratum_Feature_Relationship_Site_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Stratum_Feature_Relationship/Vars/Stratum_Feature_Relationship_Year_of_Campaign
     */
    public static EditText get_StratumFeatureRelationship_Vars_StratumFeatureRelationshipYearofCampaign(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Vars/Stratum_Feature_Relationship_Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Accuracy
     */
    public static View get_Trench_Trench_Accuracy(Solo solo) {
        String ref = "Trench/Trench/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Brief_Description
     */
    public static EditText get_Trench_Trench_BriefDescription(Solo solo) {
        String ref = "Trench/Trench/Brief_Description";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Date_Closed
     */
    public static View get_Trench_Trench_DateClosed(Solo solo) {
        String ref = "Trench/Trench/Date_Closed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Easting
     */
    public static View get_Trench_Trench_Easting(Solo solo) {
        String ref = "Trench/Trench/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Latitude
     */
    public static View get_Trench_Trench_Latitude(Solo solo) {
        String ref = "Trench/Trench/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Longitude
     */
    public static View get_Trench_Trench_Longitude(Solo solo) {
        String ref = "Trench/Trench/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Northing
     */
    public static View get_Trench_Trench_Northing(Solo solo) {
        String ref = "Trench/Trench/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Team_Members
     */
    public static EditText get_Trench_Trench_TeamMembers(Solo solo) {
        String ref = "Trench/Trench/Team_Members";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Trench_SW_Corner_Elevation_m
     */
    public static EditText get_Trench_Trench_TrenchSWCornerElevationm(Solo solo) {
        String ref = "Trench/Trench/Trench_SW_Corner_Elevation_m";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Trench_Site_Name
     */
    public static View get_Trench_Trench_TrenchSiteName(Solo solo) {
        String ref = "Trench/Trench/Trench_Site_Name";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Trench_Trench_ID
     */
    public static View get_Trench_Trench_TrenchTrenchID(Solo solo) {
        String ref = "Trench/Trench/Trench_Trench_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Trench/Your_Discussion
     */
    public static EditText get_Trench_Trench_YourDiscussion(Solo solo) {
        String ref = "Trench/Trench/Your_Discussion";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench/Vars/Trench_Year_of_Campaign
     */
    public static EditText get_Trench_Vars_TrenchYearofCampaign(Solo solo) {
        String ref = "Trench/Vars/Trench_Year_of_Campaign";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench_Files/Add_Trench_Files/File_Comment
     */
    public static EditText get_TrenchFiles_AddTrenchFiles_FileComment(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/File_Comment";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench_Files/Add_Trench_Files/File_Name
     */
    public static EditText get_TrenchFiles_AddTrenchFiles_FileName(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/File_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench_Files/Add_Trench_Files/Trench_Files_Site_Name
     */
    public static View get_TrenchFiles_AddTrenchFiles_TrenchFilesSiteName(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/Trench_Files_Site_Name";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench_Files/Add_Trench_Files/Trench_Files_Trench_ID
     */
    public static View get_TrenchFiles_AddTrenchFiles_TrenchFilesTrenchID(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/Trench_Files_Trench_ID";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Trench_Files/Add_Trench_Files/Trench_Files_Year_of_Campaign
     */
    public static View get_TrenchFiles_AddTrenchFiles_TrenchFilesYearofCampaign(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/Trench_Files_Year_of_Campaign";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Site/Choose_an_Existing_Site
     */
    public static View get_Control_Site_ChooseanExistingSite(Solo solo) {
        String ref = "Control/Site/Choose_an_Existing_Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Locus/FCNs/List_of_Related_FCNs
     */
    public static View get_Locus_FCNs_ListofRelatedFCNs(Solo solo) {
        String ref = "Locus/FCNs/List_of_Related_FCNs";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Locus/Relationships/Existing_Relationships_to_This_Locus
     */
    public static View get_Locus_Relationships_ExistingRelationshipstoThisLocus(Solo solo) {
        String ref = "Locus/Relationships/Existing_Relationships_to_This_Locus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Relationship/Legacies/List_of_Existing_Legacies
     */
    public static View get_Relationship_Legacies_ListofExistingLegacies(Solo solo) {
        String ref = "Relationship/Legacies/List_of_Existing_Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Relationship/Relationships/Existing_Relationships
     */
    public static View get_Relationship_Relationships_ExistingRelationships(Solo solo) {
        String ref = "Relationship/Relationships/Existing_Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Relationship/Relationships/Unrelated_Loci
     */
    public static View get_Relationship_Relationships_UnrelatedLoci(Solo solo) {
        String ref = "Relationship/Relationships/Unrelated_Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Site/Site/List_of_Existing_Trenches
     */
    public static View get_Site_Site_ListofExistingTrenches(Solo solo) {
        String ref = "Site/Site/List_of_Existing_Trenches";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Stratum_Feature/Stratum_Feature_Loci/Existing_Relationships_to_This_Stratum_Feature
     */
    public static View get_StratumFeature_StratumFeatureLoci_ExistingRelationshipstoThisStratumFeature(Solo solo) {
        String ref = "Stratum_Feature/Stratum_Feature_Loci/Existing_Relationships_to_This_Stratum_Feature";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Stratum_Feature_Relationship/Legacies/List_of_Existing_Legacies
     */
    public static View get_StratumFeatureRelationship_Legacies_ListofExistingLegacies(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Legacies/List_of_Existing_Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Stratum_Feature_Relationship/Relationships/Existing_Relationships
     */
    public static View get_StratumFeatureRelationship_Relationships_ExistingRelationships(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Existing_Relationships";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Stratum_Feature_Relationship/Relationships/Unrelated_Loci
     */
    public static View get_StratumFeatureRelationship_Relationships_UnrelatedLoci(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Unrelated_Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Trench/Diaries/List_of_Existing_Diaries
     */
    public static View get_Trench_Diaries_ListofExistingDiaries(Solo solo) {
        String ref = "Trench/Diaries/List_of_Existing_Diaries";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Trench/FCNs/List_of_Existing_FCNs
     */
    public static View get_Trench_FCNs_ListofExistingFCNs(Solo solo) {
        String ref = "Trench/FCNs/List_of_Existing_FCNs";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Trench/Legacies/List_of_Existing_Legacies
     */
    public static View get_Trench_Legacies_ListofExistingLegacies(Solo solo) {
        String ref = "Trench/Legacies/List_of_Existing_Legacies";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Trench/Loci/List_of_Existing_Loci
     */
    public static View get_Trench_Loci_ListofExistingLoci(Solo solo) {
        String ref = "Trench/Loci/List_of_Existing_Loci";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Trench/Strata_Features/List_of_Existing_Strata_Features
     */
    public static View get_Trench_StrataFeatures_ListofExistingStrataFeatures(Solo solo) {
        String ref = "Trench/Strata_Features/List_of_Existing_Strata_Features";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: picture
        Ref:  Locus/Deposit/Soil_Particle_Sorting
     */
    public static View get_Locus_Deposit_SoilParticleSorting(Solo solo) {
        String ref = "Locus/Deposit/Soil_Particle_Sorting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: picture
        Ref:  Locus/General/Locus_Type
     */
    public static View get_Locus_General_LocusType(Solo solo) {
        String ref = "Locus/General/Locus_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: picture
        Ref:  Sediment_Aggregate/Sediment_Aggregate/Soil_Stone_Shape
     */
    public static View get_SedimentAggregate_SedimentAggregate_SoilStoneShape(Solo solo) {
        String ref = "Sediment_Aggregate/Sediment_Aggregate/Soil_Stone_Shape";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  FCN/General/Analyzed
     */
    public static View get_FCN_General_Analyzed(Solo solo) {
        String ref = "FCN/General/Analyzed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  FCN/General/Washed
     */
    public static View get_FCN_General_Washed(Solo solo) {
        String ref = "FCN/General/Washed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  FCN/General/Weighted
     */
    public static View get_FCN_General_Weighted(Solo solo) {
        String ref = "FCN/General/Weighted";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Locus/Cut/Break_of_Slope_-_Base
     */
    public static View get_Locus_Cut_BreakofSlopeBase(Solo solo) {
        String ref = "Locus/Cut/Break_of_Slope_-_Base";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Locus/Cut/Break_of_Slope_-_Top
     */
    public static View get_Locus_Cut_BreakofSlopeTop(Solo solo) {
        String ref = "Locus/Cut/Break_of_Slope_-_Top";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Locus/Cut/Shape_of_Corners
     */
    public static View get_Locus_Cut_ShapeofCorners(Solo solo) {
        String ref = "Locus/Cut/Shape_of_Corners";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Locus/Deposit/Sterile
     */
    public static View get_Locus_Deposit_Sterile(Solo solo) {
        String ref = "Locus/Deposit/Sterile";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Stratum_Feature/General/Record_Type
     */
    public static View get_StratumFeature_General_RecordType(Solo solo) {
        String ref = "Stratum_Feature/General/Record_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: viewfiles
        Ref:  FCN/General/View_Attached_Files
     */
    public static View get_FCN_General_ViewAttachedFiles(Solo solo) {
        String ref = "FCN/General/View_Attached_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: viewfiles
        Ref:  Locus/Add/View_Attached_Files
     */
    public static View get_Locus_Add_ViewAttachedFiles(Solo solo) {
        String ref = "Locus/Add/View_Attached_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: viewfiles
        Ref:  Stratum_Feature/Add/View_Attached_Files
     */
    public static View get_StratumFeature_Add_ViewAttachedFiles(Solo solo) {
        String ref = "Stratum_Feature/Add/View_Attached_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: viewfiles
        Ref:  Trench_Files/Add_Trench_Files/View_Attached_Files
     */
    public static View get_TrenchFiles_AddTrenchFiles_ViewAttachedFiles(Solo solo) {
        String ref = "Trench_Files/Add_Trench_Files/View_Attached_Files";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Locus/Relationships/Selected_Relationship
     */
    public static View get_Locus_Relationships_SelectedRelationship(Solo solo) {
        String ref = "Locus/Relationships/Selected_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Relationship/Relationships/Parent_Identifier
     */
    public static View get_Relationship_Relationships_ParentIdentifier(Solo solo) {
        String ref = "Relationship/Relationships/Parent_Identifier";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Relationship/Relationships/Proposed_Relationship
     */
    public static View get_Relationship_Relationships_ProposedRelationship(Solo solo) {
        String ref = "Relationship/Relationships/Proposed_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Relationship/Relationships/Selected_Relationship
     */
    public static View get_Relationship_Relationships_SelectedRelationship(Solo solo) {
        String ref = "Relationship/Relationships/Selected_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Site/Site/Guide
     */
    public static View get_Site_Site_Guide(Solo solo) {
        String ref = "Site/Site/Guide";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Stratum_Feature/Add/Guide_2
     */
    public static View get_StratumFeature_Add_Guide2(Solo solo) {
        String ref = "Stratum_Feature/Add/Guide_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Stratum_Feature/Stratum_Feature_Loci/Selected_Relationship
     */
    public static View get_StratumFeature_StratumFeatureLoci_SelectedRelationship(Solo solo) {
        String ref = "Stratum_Feature/Stratum_Feature_Loci/Selected_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Stratum_Feature_Relationship/Relationships/Parent_Identifier
     */
    public static View get_StratumFeatureRelationship_Relationships_ParentIdentifier(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Parent_Identifier";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Stratum_Feature_Relationship/Relationships/Proposed_Relationship
     */
    public static View get_StratumFeatureRelationship_Relationships_ProposedRelationship(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Proposed_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Stratum_Feature_Relationship/Relationships/Selected_Relationship
     */
    public static View get_StratumFeatureRelationship_Relationships_SelectedRelationship(Solo solo) {
        String ref = "Stratum_Feature_Relationship/Relationships/Selected_Relationship";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Trench/Trench/Grid_SW_Corner_Coordinates
     */
    public static View get_Trench_Trench_GridSWCornerCoordinates(Solo solo) {
        String ref = "Trench/Trench/Grid_SW_Corner_Coordinates";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  User/Help/Help
     */
    public static View get_User_Help_Help(Solo solo) {
        String ref = "User/Help/Help";
        return (android.view.View) solo.getView((Object) ref);
    }
}
