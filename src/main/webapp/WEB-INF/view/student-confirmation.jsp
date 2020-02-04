<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE>
<html>

<head>
    <title>
        Student Confirmation
    </title>
</head>

<body>
The Student is confirmed: ${student.firstName} ${student.lastName}
<br><br>

Country: ${student.country}
<br><br>

Favorite Language is: ${student.favouriteLanguage}
<br><br>

Operating Sytems Used:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">

        <li>${temp}</li>

        </c:forEach>
    </ul>

</body>
</html>