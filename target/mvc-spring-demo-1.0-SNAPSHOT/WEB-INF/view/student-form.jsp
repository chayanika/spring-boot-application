<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE>
<html>

<head>
    <title>
        The Student Register Form
    </title>
</head>

<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br><br>
        Last name: <form:input path="lastName"/>
        <br><br>
        Country:
        <form:select path="country">
            <%--<form:option value="Brazil" label="Brazil"></form:option>--%>
            <%--<form:option value="France" label="France"/>--%>
            <%--<form:option value="Germany" label="Germany"/>--%>
            <%--<form:option value="India" label="India"/>--%>
            <form:options items="${student.countryOptions}"/>
        </form:select>
        <br><br>

        Favorite Language:
         <form:radiobutton path="favouriteLanguage" value="Java"/> Java
         <form:radiobutton path="favouriteLanguage" value="PHP"/> PHP
         <form:radiobutton path="favouriteLanguage" value="Ruby"/> Ruby
         <form:radiobutton path="favouriteLanguage" value="Python"/> Python
         <form:radiobutton path="favouriteLanguage" value="Scala"/> Scala
        <br><br>

        Operating Systems used:
        <form:checkbox path="operatingSystems" value="MacOS"/> MacOS
        <form:checkbox path="operatingSystems" value="Linix"/> Linux
        <form:checkbox path="operatingSystems" value="Windows"/> Windows
        <br><br>

        <input type="submit" value = "Submit"/>
    </form:form>

</body>
</html>