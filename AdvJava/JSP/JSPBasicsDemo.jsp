<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>

    <head>
        <title>JSP Basics Demo</title>
    </head>

    <body>
        <h2>Welcome to JSP Basics</h2>

        <%-- JSP Scriptlet Example --%>
            <% String name="Gaurav" ; int age=22; out.println("Name: " + name + " <br>");
                out.println("Age: " + age + "<br>");
                %>

                <%-- JSP Expression Example --%>
                    <p>2 + 3 = <%= 2 + 3 %>
                    </p>

                    <%-- JSP Declaration Example --%>
                        <%! public String greet() { return "Hello from JSP Declaration!" ; } %>
                            <p>
                                <%= greet() %>
                            </p>
    </body>

    </html>