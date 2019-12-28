package com.hy.powerplatform.login.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dell on 2018/5/3.
 */

public class Login implements Serializable {

    /**
     * success : true
     * username : 欧阳晓林
     * userId : 9354
     * userCode : 1729
     * depId : 500
     * depName : 信息技术部
     * positionStatus : 0
     * superRoleName : 信息部营运部分管领导
     * roleName : 信息技术部负责人
     * rights : Mod_Oa,MyDesktop,AppHome,_TaskBeginPanelView,_TodoPanelView,_MyDocumentPanelView,_TaskPanelView,_MessagePanelView,_ConferenceView,_NewTestView,_PerformTasksView,_AppLoginAnalysisView222,SupervisionTask,SuperTaskOperView,_updateSuper,SuperWorkTaskSuperView,CalendarPlanView_1,DiaryView,_publishSupd,MySubUserDiaryView,WeeklyView,_publishSub,MySubUserWeeklyView,MeetingManager,MyInitiatorConferenceView,MyJoinConferenceView,MyJoinedConferenceView,TemporaryConferenceView,WaitOpenConferenceView,HaveOpenConferenceView,WaitApprovedConfView,_ConfApprovedDel,ConfApplyView,ConfSummaryView,AddConfSummaryView,Flow,NewProcess,MyTaskView,MyRunningTaskView,RevokeFlowDetailView,MyProcessRunView,RelevantProcessRunView,ProcessCountView,Archives,NoticeView,_NoticeQuery,_NoticeAdd,_NoticeDel,Communication,ProfileForm,PhoneBook,FileSendView,InnerMail,MailForm,PersonalMailBoxView,Document,PrivateDocumentView,Mod_Hr,Hrm,Mod_YF,Hotline,HotlineRegisterView,_HotlineRegisterAddUnCheck,_HotlineRegisterRemoveUnCheck,_HotlineRegisterCheckUnCheck,_HotlineRegisterCancelUnCheck,_HotlineRegisterLowerUnCheck,Mod_cashier,cashier,cashiers,CarMoneyDetailView,CarMoneyZongView,CarMoneyMileAbnormalView,Mod_staffzone,StaffLearn,MoniTestView,OnlineTestView,LineSafetyInstructionView,TrainingMaterialsView,AccidentCaseView,Mod_Sys,SystemSetting,AppUserView,_AppUserQuery,_AppUserAdd,_AppUserEdit,_AppUserDel,_AppUserReset,AppLoginView,AppLoginAnalysisView,AppRoleView,_AppRoleList,_AppRoleAdd,_AppRoleEdit,_AppRoleDel,_AppRoleGrant,AppRoleDataFuncView,AppRoleOrgFuncView,AppRoleComplaintFuncView,AppRoleRewardPunishmentSurfaceFuncView,HZItemJurisdiction2View,OrgSettingView,SubordinateView,PositionUserView,CompanyView,DemensionView,TypeManager,DicManager,_DictionaryQuery,_DictionaryAdd,_DictionaryEdit,_DictionaryDel,SerialNumberView,flowManager,ProDefinitionManager,_FlowCheck,Mod_zhfx,BasicData,OperationCountView,DetailedOperatingSummary,MileDataSummary,MileDataSummaryDepView,MileDataSummaryLineView,MileDataSummaryCarView,MileDataSummaryDriverView,IncomeDataAggregation,IncomeSummaryDepView,IncomeSummaryLineView,IncomeSummaryCarView,CostDataAggregation,CostSummaryDepView,CostSummaryLineView,CostSummaryCarView,DetailedOperatingCount,DetailedOperatingAnalysis,OperationaldataCompareAnalysisView,OperationaldataQOQAnalysisView,OperationStatistics,OperationStatisticsNDView,OperationStatisticsJDView,OperationStatisticsYDView,ygsj,HrTongJiMgr,empProfileCountView,LeaveDaysStatisticsView,EmpDepChangeReportView,PostStatisticsAnalysisView,Mod_clwxgl,measure,WeiBaoBase,MaintenanceProjectView,GradeDicManager,FarmDicManager,CategoryDicManager,FactoryManager,FactoryHouseRelationView,MeasurePlaceView,Measure,MeasureBusView,repairdispatching,repairProject,repairMaterialConfirmView,oldJobProject,repairMaterial,BaoYang,maintainBusView,maintaindispatching,maintainProject,maintainMaterial,maintainCheck,WeiBaoQuery,SearchBusRepair,MaterialCountView,ProjectCountView,oldJobCountView,CostCountView,RepairSumView,repairYearCountView,maintainYearCountView,BusMaintenance,BusMaintain,BusMaintainPlanView,BusMaintenanceRecordView,BusMaintenanceCountView,Mod_zcgl,GoodManeger,OfficeGoodsManageView,_OfficeGoodsQuery,_OfficeGoodsTypeManage,_OfficeGoodsAdd,_OfficeGoodsEdit,_OfficeGoodsDel,InStockView,_InStockQuery,_InStockAdd,_InStockEdit,_InStockDel,GoodsApplyView,_GoodsApplyQuery,_GoodsApplyAdd,_GoodsApplyEdit,_GoodsApplyDel,GoodsCheckView,FixedAssetsManage,PermanentAssets,PermanentAssetsView,PermanentAssetsDepositView,PermanentAssetsScrapAuditView,PermanentAssetsChangeView,Mod_bigdata
     * empprofile : {"age":"34","sex":"男","mobile":"13755865751","idCard":"362201198506170056","address":""}
     * rolues : [{"defId":"10094","proType":"行政管理","name":"公司信息发布审批单","description":"公司信息发布审批单","createtime":"2019-02-24 17:43:30.353","deployId":"8000048","newVersion":"1","status":"1","drawDefXml":"\n \n 发起人<\/label>\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:StartEvent>\n \n <\/expression>\n 部门负责人<\/label>\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 分管领导<\/label>\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 综合办公室<\/label>\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n \n BOTTOM<\/id>\n <\/ciied:Port>\n \n BOTTOM<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 综合办公室<\/label>\n <\/bg:SequenceFlow>\n \n 结束1<\/label>\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n \n TOP<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:EndEvent>\n \n <\/expression>\n 总经理<\/label>\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 董事长<\/label>\n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 总经理<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 董事长<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 综合办公室<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 综合办公室<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 申请人<\/label>\n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 分管领导1<\/label>\n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 分管领导<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 部门负责人<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 分管领导<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 综合办公室<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 总经理<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 申请人<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 总经理<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 承办部门<\/label>\n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n \n TOP<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 结束1<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 申办部门确认<\/label>\n \n \n CENTER<\/id>\n <\/ciied:Port>\n \n TOP<\/id>\n <\/ciied:Port>\n \n BOTTOM<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 申办部门确认<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 结束1<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 承办部门<\/label>\n <\/bg:SequenceFlow>\n<\/diagram>"},{"defId":"10135","proType":"人资管理","name":"请假流程","description":"请假流程","createtime":"2019-03-20 22:45:51.65","deployId":"8280019","newVersion":"2","status":"1","drawDefXml":"\n \n 开始<\/label>\n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:StartEvent>\n \n <\/expression>\n 部门负责人<\/label>\n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 分管领导3<\/label>\n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n com.htsoft.oa.workflow.handler.DecisionHandlerImpl<\/handler>\n 决策1<\/label>\n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Gateway>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 决策1<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 分管领导3<\/label>\n <\/bg:SequenceFlow>\n \n com.htsoft.oa.workflow.handler.DecisionHandlerImpl<\/handler>\n 决策2<\/label>\n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Gateway>\n \n <\/expression>\n 人力资源部<\/label>\n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 总经理<\/label>\n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 决策2<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 总经理<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 人力资源部<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 人力资源部<\/label>\n <\/bg:SequenceFlow>\n \n 结束1<\/label>\n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:EndEvent>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 结束1<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 分管领导1<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 申请人<\/label>\n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 申请人<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 部门负责人<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 分管领导1<\/label>\n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n com.htsoft.oa.workflow.handler.DecisionHandlerImpl<\/handler>\n 决策3<\/label>\n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Gateway>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 决策3<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 总经理<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 人力资源部<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 分管领导2<\/label>\n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 分管领导2<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 人力资源部<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 人力资源部<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 分管领导<\/label>\n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 分管领导<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 总经理<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 总经理<\/label>\n <\/bg:SequenceFlow>\n<\/diagram>"},{"defId":"20411","proType":"行政管理","name":"信息技术部电子设备故障维修","description":"信息技术部电子设备故障维修","createtime":"2019-03-11 11:28:54.007","deployId":"8150148","newVersion":"1","status":"1","drawDefXml":"\n \n 开始<\/label>\n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:StartEvent>\n \n <\/expression>\n 申请人<\/label>\n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 部门负责人<\/label>\n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 信息技术部<\/label>\n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 申请人<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 信息技术部<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 部门负责人<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n 信息技术部<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 办结安排<\/label>\n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n \n RIGHT<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 申办部门确认<\/label>\n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n \n RIGHT<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 办结评价<\/label>\n <\/bg:SequenceFlow>\n \n 结束1<\/label>\n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:EndEvent>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 结束1<\/label>\n <\/bg:SequenceFlow>\n \n <\/expression>\n 办结安排1<\/label>\n \n \n CENTER<\/id>\n <\/ciied:Port>\n \n TOP<\/id>\n <\/ciied:Port>\n \n LEFT<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 办结安排1<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 申办部门确认<\/label>\n <\/bg:SequenceFlow>\n<\/diagram>"},{"defId":"20520","proType":"行政管理","name":"公司请示上报流程","description":"请示上报","createtime":"2019-11-28 00:21:14.623","deployId":"9720205","newVersion":"5","status":"1","drawDefXml":"\n \n 开始<\/label>\n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:StartEvent>\n \n 发起人<\/label>\n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n 部门负责人<\/label>\n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n 分管领导<\/label>\n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 经办分管领导<\/label>\n \n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n <\/expression>\n 办结安排<\/label>\n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n 通知申请部门<\/label>\n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n 结束1<\/label>\n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:EndEvent>\n \n 总经理<\/label>\n \n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n 董事长<\/label>\n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n 通知总经理<\/label>\n \n \n \n \n \n \n \n \n \n CENTER<\/id>\n <\/ciied:Port>\n <\/ports>\n <\/bg:Task>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 发起人<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 部门负责人<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 分管领导<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 经办分管领导<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 总经理<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 董事长<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 经办分管领导<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 通知总经理<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 经办分管领导<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 经办部门<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 通知申请部门<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 结束1<\/label>\n <\/bg:SequenceFlow>\n \n \n \n <\/fallbackEndPoint>\n \n \n <\/fallbackStartPoint>\n to 经办部门<\/label>\n <\/bg:SequenceFlow>\n<\/diagram>"}]
     */

    private boolean success;
    private String username;
    private String userId;
    private String userCode;
    private String depId;
    private String depName;
    private String positionStatus;
    private String superRoleName;
    private String roleName;
    private String rights;
    private EmpprofileBean empprofile;
    private List<RoluesBean> rolues;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(String positionStatus) {
        this.positionStatus = positionStatus;
    }

    public String getSuperRoleName() {
        return superRoleName;
    }

    public void setSuperRoleName(String superRoleName) {
        this.superRoleName = superRoleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public EmpprofileBean getEmpprofile() {
        return empprofile;
    }

    public void setEmpprofile(EmpprofileBean empprofile) {
        this.empprofile = empprofile;
    }

    public List<RoluesBean> getRolues() {
        return rolues;
    }

    public void setRolues(List<RoluesBean> rolues) {
        this.rolues = rolues;
    }

    public static class EmpprofileBean implements Serializable{
        /**
         * age : 34
         * sex : 男
         * mobile : 13755865751
         * idCard : 362201198506170056
         * address :
         */

        private String age;
        private String sex;
        private String mobile;
        private String idCard;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getIdCard() {
            return idCard;
        }

        public void setIdCard(String idCard) {
            this.idCard = idCard;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class RoluesBean implements Serializable{
        /**
         * defId : 10094
         * proType : 行政管理
         * name : 公司信息发布审批单
         * description : 公司信息发布审批单
         * createtime : 2019-02-24 17:43:30.353
         * deployId : 8000048
         * newVersion : 1
         * status : 1
         * drawDefXml :

         发起人</label>
















         CENTER</id>
         </ciied:Port>
         </ports>
         </bg:StartEvent>

         </expression>
         部门负责人</label>




















         CENTER</id>
         </ciied:Port>
         </ports>
         </bg:Task>

         </expression>
         分管领导</label>

















         CENTER</id>
         </ciied:Port>
         </ports>
         </bg:Task>

         </expression>
         综合办公室</label>























         CENTER</id>
         </ciied:Port>

         BOTTOM</id>
         </ciied:Port>

         BOTTOM</id>
         </ciied:Port>
         </ports>
         </bg:Task>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 综合办公室</label>
         </bg:SequenceFlow>

         结束1</label>

















         CENTER</id>
         </ciied:Port>

         TOP</id>
         </ciied:Port>
         </ports>
         </bg:EndEvent>

         </expression>
         总经理</label>














         CENTER</id>
         </ciied:Port>
         </ports>
         </bg:Task>

         </expression>
         董事长</label>











         CENTER</id>
         </ciied:Port>
         </ports>
         </bg:Task>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 总经理</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 董事长</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 综合办公室</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 综合办公室</label>
         </bg:SequenceFlow>

         </expression>
         申请人</label>








         CENTER</id>
         </ciied:Port>
         </ports>
         </bg:Task>

         </expression>
         分管领导1</label>







         CENTER</id>
         </ciied:Port>
         </ports>
         </bg:Task>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 分管领导</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 部门负责人</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 分管领导</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 综合办公室</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 总经理</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 申请人</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 总经理</label>
         </bg:SequenceFlow>

         </expression>
         承办部门</label>





         CENTER</id>
         </ciied:Port>

         TOP</id>
         </ciied:Port>
         </ports>
         </bg:Task>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 结束1</label>
         </bg:SequenceFlow>

         </expression>
         申办部门确认</label>


         CENTER</id>
         </ciied:Port>

         TOP</id>
         </ciied:Port>

         BOTTOM</id>
         </ciied:Port>
         </ports>
         </bg:Task>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 申办部门确认</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 结束1</label>
         </bg:SequenceFlow>



         </fallbackEndPoint>


         </fallbackStartPoint>
         to 承办部门</label>
         </bg:SequenceFlow>
         </diagram>
         */

        private String defId;
        private String proType;
        private String name;
        private String description;
        private String createtime;
        private String deployId;
        private String newVersion;
        private String status;

        public String getDefId() {
            return defId;
        }

        public void setDefId(String defId) {
            this.defId = defId;
        }

        public String getProType() {
            return proType;
        }

        public void setProType(String proType) {
            this.proType = proType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getDeployId() {
            return deployId;
        }

        public void setDeployId(String deployId) {
            this.deployId = deployId;
        }

        public String getNewVersion() {
            return newVersion;
        }

        public void setNewVersion(String newVersion) {
            this.newVersion = newVersion;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }
}
