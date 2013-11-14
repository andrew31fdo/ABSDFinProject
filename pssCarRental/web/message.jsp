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
                $('#info').fadeIn('slow');
                $('#info').fadeout('slow');
                $('#info').fadeIn('slow');
            }, 1000);
        </script>
</head>
<body onload="getParameterByName('msg');" style="background-color: #005580">
    <div class="row">
        <div class="span5 offset4">
            <div class="well">
                <div id="infohedder" style="width: 100%;height: 50px;background-color: #002a80">
                    <span id="info" class="label label-warning"></span>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
