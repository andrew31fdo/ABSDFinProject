<%-- 
    Document   : make
    Created on : Nov 10, 2013, 2:11:14 AM
    Author     : Ronal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/bootstrap.css" rel="stylesheet">
        <script src="resources/js/jquery-1.9.1.js"></script>
        <title>Make</title>
        <script>
            function getParameterByName(name) {
                name = name.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
                var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"), results = regex.exec(location.search);
                var msg = (results === null) ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
                //alert(msg);
                document.getElementById("info").innerHTML = msg;
            }
            setTimeout(function() {
                $('#info').fadeOut('slow');
            }, 1000);
        </script>

</head>
<body onload="getParameterByName('msg');">
    <div id="infohedder" style="width: 100%;height: 50px;background-color: #002a80">
        <span id="info" class="label label-warning"></span>
    </div>
    <div id="content" style="width: 100%;height: 500px;background-color: #0088cc; top: 50px; position: absolute">
        <div id="menu" style="width: 20%;height: 500px;background-color: #bfbfbf; position: absolute">
            <ul class="nav nav-pills nav-stacked">
                <li class="active"><a href="addMake.jsp" target="rightframe">Add Make</a></li>
                <li><a href="viewMake.jsp" target="rightframe">View All</a></li>
            </ul>
        </div>
        <div id="rightpane" style="width: 80%;height: 500px;background-color: #bfbfbf; position: absolute; left:200px ">
            <iframe name="rightframe" frameBorder="0" height="100%" width="100%" style="background-color:#bfbfbf"></iframe>
        </div>
    </div>
</body>
</html>
