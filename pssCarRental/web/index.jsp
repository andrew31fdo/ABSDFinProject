<%-- 
    Document   : index
    Created on : Nov 8, 2013, 8:55:02 PM
    Author     : Ronal
--%>


<!DOCTYPE html>

<html>
    <head>
        <link href="resources/css/bootstrap.css" rel="stylesheet">
        <script type="text/javascript">
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
        <div class="row">
            <div class="span5 offset4">
                <div class="well">
                    <img src="resources/img/rentacar.jpg">
                </div>
            </div>
        </div>

        <div class="row">
            <div class="span5 offset4">
                <div class="well">
                    <legend>Sign in to Car Rental System</legend>
                    <form method="POST" action="Control" accept-charset="UTF-8">            
                        <input class="span3" placeholder="Username" type="text" name="username">
                        <input class="span3" placeholder="Password" type="password" name="password"> 
                        <input type="hidden" name="module" value="user">
                        <input type="hidden" name="action" value="validate">
                        <label class="checkbox">
                            <input type="checkbox" name="remember" value="1"> Remember Me
                        </label>
                        <button class="btn-info btn" type="submit">Login</button>      
                    </form>    
                    <span id="info" class="label label-warning"></span>
                </div>
            </div>
        </div>
    </body>
</html>