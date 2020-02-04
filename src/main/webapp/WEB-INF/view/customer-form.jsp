<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE>
<html>

<head>
    <title>
        Customer Register Form
    </title>
    <style>
        .error{color: red}
    </style>
</head>

<body>
    Fill out the form. Asterisk (*) means required.
    <br><br>
    <form:form action="processForm" modelAttribute="customer">

    First Name: <form:input path="firstName"/>
    <br><br>
    Last Name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
        <br><br>

    Free Passes:<form:input path="frePasses"/>
    <form:errors path="frePasses" cssClass="error"/>
        <br><br>

    Postal Code: <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>

        <br><br>


        Course Code: <form:input path="courseCode"/>
        <form:errors path="courseCode" cssClass="error"/>

        <br><br>
        <input type="submit" value="Submit">

    </form:form>

</body>
</html>
