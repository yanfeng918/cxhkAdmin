<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>信息列表</title>


    <link href="${base}/resources/admin/css/common.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${base}/resources/js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="${base}/resources/js/Calendar.js"></script>
    <script type="text/javascript" src="${base}/resources/admin/js/common.js"></script>

    <link rel="stylesheet" type="text/css" href="${base}/resources/dataTables/media/css/jquery.dataTables.min.css">
    <script type="text/javascript" src="${base}/resources/dataTables/media/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="${base}/resources/js/creditInfo/list.js"></script>

</head>
<body>
<#--<div class="path">-->
    <#--<a href="${base}/admin/index/"></a> &raquo; 有效房源 <span>(${pager.totalCount})</span>-->
<#--</div>-->
<form id="listForm" action="list" method="get">

    <input type="hidden" value="${type}" id="houseType"/>


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
    </div>

</form>

</body>
</html>