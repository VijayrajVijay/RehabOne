package Support;

public class Xpath {
	//Login Page
	public  String Xpath_username = "//input[@id='Username']";
	public  String Xpath_password = "//input[@id='Password']";
	public  String Xpath_signin = "//input[@type='button']";
	//Pages link
	//patientChart Page
	public  String  link_patientChart= "(//a[contains(@href,'/Patient')])[1]";
	public  String  link_patientChartLabel= "//div/h5[text()='Patient Chart List']";
 
	//dashBoard Page
	public  String  link_dashboard= "(//a[contains(@href,'/Dash')])[1]";
	public  String  link_dashboardlabel= "//a[text()='General']";

   //patientPortal Page
	public  String  link_patientPortal= "//span[text()='Patient Portal']//parent::a";
	public  String  link_admissionPortal= "(//span[text()='Admission']//parent::a)[1]";
	public  String  link_admission2Portal= "(//span[text()='Admission']//parent::a)[2]";
	public  String  link_inquiryPortal= "(//span[text()='Admission']//parent::a)[1]";
	public  String  link_assessementcalendarPortal= "//span[text()='Assessment Calendar']//parent::a";
	public  String  link_patientReleasePortal= "//span[text()='Patient Release of Information']//parent::a";

	//patient account update
	public  String  link_patientAccountUpdatePortal= "//span[text()='Patient Account Update']//parent::a";
	public  String  link_UpdateMailingAddressPortal= "//span[text()='Update Mailing Address']//parent::a";
	public  String  link_AssignPhysicianPortal= "//span[text()='Assign Physician']//parent::a";
	public  String  link_AssignGfAndClinicPortal= "//span[text()='Assign GF & Clinic']//parent::a";

	//buisness office
	public  String  link_BusinessOfficePortal= "(//span[text()='Business Office']//parent::a)[1]";
	public  String  link_ViewAssesementsPart1Portal= "(//span[text()='View Assessments Part1']//parent::a)[1]";
	public  String  link_InquiryPatientContactLogPortal= "(//span[text()='Inquiry Patient Contact Log']//parent::a)[1]";
	
	//General
	public  String  link_generalPortal= "(//span[text()='General']//parent::a)[1]";
	public  String  link_uploadDocuments= "(//span[text()='Upload Documents']//parent::a)[1]";
	public  String  link_citSignOff= "(//span[text()='CIT Signoff']//parent::a)[1]";
	public  String  link_patientContactLog= "(//span[text()='Patient ContactLog']//parent::a)[1]";
	public  String  link_patientChartLog= "(//span[text()='Patient Chart']//parent::a)[1]";
	
	//medical
	public  String  link_medicalPortalPP= "(//span[text()='Medical']//parent::a)[1]";

	
	//patient transition
	public  String  link_patientTransitionPortal= "(//span[text()='Patient Transition']//parent::a)[1]";
	public  String  link_CDMPortal= "(//span[text()='Chronic Disease Management']//parent::a)[1]";
	public  String  link_patientTransition2Portal= "(//span[text()='Patient Transition']//parent::a)[2]";

//clinical
	public  String  link_assesementPart2Portal= "(//span[text()='Assessment Part II']//parent::a)[1]";
	public  String  link_counsellorPortal= "(//span[text()='Counselor Note']//parent::a)[1]";
	public  String  link_iOPPortal= "(//span[text()='IOP Group Note']//parent::a)[1]";
	public  String  link_weeklyProgressNotesPortal= "(//span[text()='Weekly Progress Notes']//parent::a)[1]";
	public  String  link_pillCountVerificatPortal= "(//span[text()='Pill Count Verification']//parent::a)[1]";
	public  String  link_ptoqDataCollectionPortal= "(//span[text()='PTOQ Data Collection']//parent::a)[1]";
	public  String  link_WPQdatacollectionPortal= "(//span[text()='WPQ data collection']//parent::a)[1]";
	public  String  link_UtilizationReviewPortal= "(//span[text()='Utilization Review']//parent::a)[1]";


	//Reports Page
	public  String  link_reportsPortal= "//span[text()='Reports']//parent::a";
	public  String  link_assessementPendingForAdmitPortal= "//span[text()='Assessments pending for Admit']//parent::a";
	public  String  link_inquiryByIntake= "//span[text()='Inquire by Intake Person']//parent::a";
	public  String  link_businessOfficePortals= "//li[@class='active']//span[text()='Buisness Office']/parent::a";

	
	//portal admin access Page
	public  String  link_adminAccessPortal= "//span[text()='Portal Admin Access']//parent::a";
	public  String  link_security = "//span[text()='Security']//parent::a";
	public  String  link_userCreationPortal= "//span[text()='User Creation']//parent::a";

	public  String  link_roleCreationPortal= "//span[text()='Role Creation']//parent::a";

	public  String  link_rolePermissionPortal= "//span[text()='Role Permission']//parent::a";

	public  String  link_widgetPermissionPortal= "//span[text()='WidgetPermission']//parent::a";

	//departments portal Page
	public  String  link_departmentsPortal= "//span[text()='Departments Portal']//parent::a";
	public  String  link_businessOfficePortal = "//li[@class='active']/ul//span[text()='Business Office']/parent::a";
	public  String  link_benefitsVerificationPortal= "(//span[text()='Benefits Verification']//parent::a)";
	public  String  link_patientStatementPortal= "//span[text()='Patient Statement']//parent::a";
	public  String  link_financialStatementPortal= "//span[text()='Financial Statement']//parent::a";
	public  String  link_paymentPlanPortal= "//span[text()='Payment Plan Update']//parent::a";
	public  String  link_admissionResultsPortal= "//span[text()='Admission Results']//parent::a";
	
	public  String  link_medicalPortal= "(//span[text()='Medical']//parent::a)[2]";
	public  String  link_PACPortal= "(//span[text()='Physician Appointment Calendar']//parent::a)[1]";
	public  String  link_labResultsPortal= "(//span[text()='Lab Results']//parent::a)[1]";
	public  String  link_mdSchedulePortal= "(//span[text()='MD Schedule']//parent::a)[1]";


	public  String  link_diagnosticsPortal= "(//span[text()='Diagnostic & Lab']//parent::a)[1]";
	public  String  link_NeuroCogPortal= "(//span[text()='NeuroCog Testing']//parent::a)[1]";
	
	


}
