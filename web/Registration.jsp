<!DOCTYPE HTML>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!-- Website Template by freewebsitetemplates.com -->
<html>
    <head>
        <meta charset="UTF-8">
        <title> Amusement Park</title>
        <link rel="stylesheet" href="css/style.css" type="text/css">
        <style>

            #txt
            {
                width:400px;
            }

        </style>
    </head> 
    <body>
        <div id="background">
            <div id="page">
                <div id="header">
                    <a href="index.html" class="logo">theme park</a>
                    <ul>
                        <li>
                            <a href="index.html">home</a>
                        </li>
                        <li>
                            <a href="blog.html">blog</a>
                        </li>

                        <li>
                            <a href="Registration.jsp">Registration</a>
                        </li>

                        <li>
                            <a href="about.html">about</a>
                        </li>
                        <li>
                            <a href="tickets.html">tickets &amp; prices</a>
                        </li>
                        <li>
                            <a href="contact.html">contact</a>
                        </li>
                    </ul>
                </div>
                <h1> Park Registration</h1>


               
               
                <s:form action="signup" method="POST" enctype="multipart/form-data">
                    <s:textfield name="user.id"  label="ParkId"></s:textfield>
                    <s:textfield name="user.parkname" label="Parkname"></s:textfield>
                    <s:textfield name="user.location" label="location"></s:textfield>
                    <s:textfield name="user.city" label="City"></s:textfield>
                    <s:textfield name="user.email" label="email"></s:textfield>
                    <s:textfield name="user.phone" label="phone"></s:textfield>
                    <s:textfield name="user.ctime" type="time" label="Closingtime"></s:textfield>
                    <s:textfield name="user.otime" type="time" label="Openingtime"></s:textfield>
                    <s:textfield name="user.sotime" type="time" label="sundayopeningtime"></s:textfield>
                    <s:textfield name="user.sctime" type="time" label="sundayclosingtime"></s:textfield>
                    <s:textfield name="user.afees" label="Adultfees"></s:textfield>
                    <s:textfield name="user.cfees" label="Childfees"></s:textfield>



                    <s:file name="uploadFile" label="Upload Image"></s:file>
                    <s:submit value="Signup"/>
                </s:form>

                <div id="footer">
                    <div>
                        <div>
                            <h3>blog</h3>
                            <p>
                                <a href="blog.html"><span>sept 2012</span> This is just a place holder, so you can see what the site would look like.</a>
                            </p>
                        </div>
                        <div>
                            <h3>categories</h3>
                            <ul class="category">
                                <li>
                                    <a href="index.html">home</a>
                                </li>
                                <li>
                                    <a href="about.html">about</a>
                                </li>
                                <li>
                                    <a href="Registration.jsp">Registration</a>
                                </li>
                                <li>
                                    <a href="blog.html">blog</a>
                                </li>
                                <li>
                                    <a href="tickets.html">tickets &amp; prices</a>
                                </li>
                                <li>
                                    <a href="contact.html">contact</a>
                                </li>
                            </ul>
                        </div>
                        <div>
                            <h3>connect</h3>
                            <ul class="connect">
                                <li id="facebook">
                                    <a href="http://freewebsitetemplates.com/go/facebook/">facebook</a>
                                </li>
                                <li id="twitter">
                                    <a href="http://freewebsitetemplates.com/go/twitter/">twitter</a>
                                </li>
                                <li id="googleplus">
                                    <a href="http://freewebsitetemplates.com/go/googleplus/">googleplus</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <p>
                        &copy; copyright 2012. all rights reserved.
                    </p>
                </div>
            </div>
        </div>
    </body>
</html>