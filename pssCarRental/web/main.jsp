<%-- 
    Document   : main
    Created on : Nov 10, 2013, 2:10:50 AM
    Author     : Ronal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/>
        <script src="resources/js/jquery-latest.min.js"></script>
        <script src="resources/js/jquery.accordion.source.js" type="text/javascript" charset="utf-8"></script>
        <script type="text/javascript">
            // <![CDATA[

            $(document).ready(function() {
                $('ul').accordion();
            });

            // ]]>
        </script>
        <style>
            body { font: 0.8em Arial, sans-serif; }
            .pageContent { width: 400px; }
            .accordion { list-style-type: none; padding: 0; margin: 0 0 30px; border: 1px solid #17a; border-top: none; border-left: none; }
            .accordion ul { padding: 0; margin: 0; float: left; display: block; width: 100%; }
            .accordion li { background: #3cf; cursor: pointer; list-style-type: none; padding: 0; margin: 0; float: left; display: block; width: 100%;}
            .accordion li.active>a { background: url('close.gif') no-repeat center right; }
            .accordion li div { padding: 20px; background: #aef; display: block; clear: both; float: left; width: 360px;}
            .accordion a { text-decoration: none; border-bottom: 1px solid #4df; font: bold 1.1em/2em Arial, sans-serif; color: #222; padding: 0 10px; display: block; cursor: pointer; background: url('open.gif') no-repeat center right;}

            /* Level 2 */
            .accordion li ul li { background: #7FD2FF; font-size: 0.9em; }
            
            /* Level 3 */
            .accordion li ul li ui li { background: #33ddaa; font-size: 0.8em; }

        </style>




        <title>Main Page</title>

    </head>
    <body>
        <div id="infohedder" style="width: 100%;height: 50px;background-color: #002a80">
            <span id="info" class="label label-warning"></span>
        </div>
        <div id="content" style="width: 100%;height: 500px;background-color: #0088cc; top: 50px; position: absolute">
            <div id="menu" style="width: 20%;height: 500px;background-color: #bfbfbf; position: absolute">
                <div id='cssmenu'>
                    <ul class="accordion">
                        <li><a href="#Vehicle">Vehicle</a>
                            <ul><li><a href="#make">Make</a>
                                    <ul><li><a href="addMake.jsp" target="rightframe">add a Make</a></li>
                                        <li><a href="viewMake.jsp" target="rightframe">View All Makes</a></li>
                                    </ul> 
                                </li>
                                <li><a href="model.jsp">Model</a></li>
                                <ul><li><a href="addModel.jsp" target="rightframe">add a Model</a></li>
                                    <li><a href="viewModel.jsp" target="rightframe">View All Models</a></li>
                                </ul> 
                                <li><a href="class.jsp">Class</a></li>
                                <ul><li><a href="addMake.jsp">add Make</a></li>
                                    <li><a href="viewMake.jsp">View All Makes</a></li>
                                </ul> 
                            </ul>
                        </li>
                        <li><a href="#antarctica">Antarctica</a> <div><span></span></div></li>
                        <li><a href="#afroeuasia">Afro-Eurasia</a>
                            <ul><li class="current"><a href="#afroeuasia-amsterdam">Amsterdam</a><div><span>D</span></div></li>
                                <li><a href="#afroeuasia-paris">Paris</a><div><span>E</span></div></li>
                                <li><a href="#afroeuasia-stockhol">Stockholm</a><div><span>F</span></div></li>
                            </ul>
                        </li>
                        <li><a href="#australia">Australia</a>
                            <ul><li><a href="#australia-melbourne">Melbourne</a><div><span>G</span></div></li>
                                <li><a href="#australia-perth">Perth</a><div><span>H</span></div></li>
                                <li><a href="#australia-sydney">Sydney</a><div><span>I</span></div></li>
                            </ul>
                        </li>
                        <li><a href="http://www.google.com">Google</a></li>
                    </ul>
                </div>
            </div>
            <div id="rightpane" style="width: 80%;height: 500px;background-color: #bfbfbf; position: absolute; left:200px ">
                <iframe name="rightframe" frameBorder="0" height="100%" width="100%" style="background-color:#bfbfbf">asas</iframe>
            </div>
        </div>
    </body>
</html>