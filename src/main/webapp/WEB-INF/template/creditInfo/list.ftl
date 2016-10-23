<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>信息列表</title>


    <link href="${base}/resources/admin/css/common.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${base}/resources/js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="${base}/resources/js/Calendar.js"></script>
    <script type="text/javascript" src="${base}/resources/admin/js/common.js"></script>

    <link rel="stylesheet" type="text/css" href="${base}/resources/bootstrap-3.3.5/css/bootstrap.min.css">
    <script type="text/javascript" src="${base}/resources/bootstrap-3.3.5/js/bootstrap.min.js"></script>

    <link rel="stylesheet" type="text/css" href="${base}/resources/dataTables/media/css/jquery.dataTables.min.css">
    <script type="text/javascript" src="${base}/resources/dataTables/media/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="${base}/resources/js/creditInfo/list.js"></script>

    <script type="text/javascript" src="${base}/resources/js/Calendar.js"></script>

</head>
<body>
<#--<div class="path">-->
    <#--<a href="${base}/admin/index/"></a> &raquo; 有效房源 <span>(${pager.totalCount})</span>-->
<#--</div>-->
<form id="inputForm">

    <table spellcheck="false" class="table table-bordered table-striped">

        <tr>
            <th class="col-md-2">

                <select id="salePrice" name="salePrice" class="form-control">
                    <option value="0,0">全部上报单位</option>
                    <option value="0,100">海口市科工信局</option>
                    <option value="100,150">海口市住建局</option>
                    <option value="150,200">海口市规划局</option>
                    <option value="200,300">海口市卫生局</option>
                    <option value="300,500">海口市政市容委</option>
                </select>
            </th>

            <th class="col-md-2">
                <select id="" name="salePrice" class="form-control">
                    <option value="0,0">组织机构名称</option>
                    <option value="0,100">组织机构代码</option>
                    <option value="100,150">统一社会信用代码</option>
                    <option value="150,200">工商注册号</option>
                    <option value="200,300">税务登记号</option>
                    <option value="300,500">自然人身份证号</option>
                    <option value="300,500">自然人姓名</option>
                </select>
            </th>
            <th class="col-md-5">
                <input id="searchCommunity" type="text" class="form-control input-sm" name="community"
                       placeholder="请输入名称"/>
            </th>
        </tr>

        <tr>
            <th class="col-md-2">
                <select id="affairCategory" name="affairCategory" class="form-control">
                    <option value="0,0">全部事项类型</option>
                    <option value="0,100">登记</option>
                    <option value="100,150">资质</option>
                    <option value="150,200">备案</option>
                </select>
            </th>

            <th>
                更新时间范围
            </th>
            <th class="col-md-3">
                <div class="demos">
                    <span>起止时间▼<input name="beginDate" type="text" id="beginDate" size="30" maxlength="10"
                                              onClick="new Calendar().show(this);" readonly="readonly"/>
                    </span>
                    <span>至▼<input name="endDate" type="text" id="endDate" size="30" maxlength="10"
                                           onClick="new Calendar().show(this);" readonly="readonly"/>
                    </span>
                </div>
            </th>
        </tr>

        <tr>
            <th colspan="2" class="tool_box">
                <button class="btn btn-primary btn-sm" type="button" id="searchHouseInfo">查&nbsp;询</button>
                <button class="btn btn-info btn-sm" type="button" id="resetBtn">重&nbsp;置</button>
            </th>
        </tr>
    </table>
</form>


    <div class="" style="margin-left:25px; margin-right: 25px; ">
        <div class="">

            <table id="houseTable" class="stripe cell-border" width="100%">
                <thead>
                <tr>
                    <th>机构组织名称或自然人名称</th>
                    <th>事项类型</th>
                    <th>更新时间</th>
                    <th>更新人</th>
                    <th>审核状态</th>
                    <th>审核人</th>
                </tr>
                </thead>
                <tbody></tbody>
            </table>

        </div>
    </div>



</body>
</html>