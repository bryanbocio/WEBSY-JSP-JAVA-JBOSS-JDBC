<%-- 
    Document   : list
    Created on : 18 dic. 2022, 3:35:07 p. m.
    Author     : xander
--%>

<%@page import="models.Person"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelsdao.PersonDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>People</h1>
        <table border="1">

            <thead>
                <tr>
                    <th>Id</th>
                    <th>DNI</th>
                    <th>Name</th>
                    <th>Actions</th>
                </tr>
            </thead>
            
            <%
                PersonDAO dao = new PersonDAO();
                List<Person > personList=dao.getAllPeople();
                Iterator<Person> iter=personList.iterator();
                Person person=null;
                while(iter.hasNext()){
                person=iter.next();
                }
            %>
            <tbody>
                <tr>
                    <td><%=person.getId()  %></td>
                    <td><%=person.getDni() %></td>
                    <td><%=person.getName() %></td>
                    <td><a>Edit</a></td>

                </tr>
            </tbody>
        </table>
    </body>
</html>
