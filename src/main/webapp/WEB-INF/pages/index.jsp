<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<body>
    <h2>Spring MVC and List Example</h2>

    <c:if test="${not empty lists}">
        <ul>
            <c:forEach var="listValue" items="${lists}">
                <li>${listValue}</li>
                <spring:message code="${listValue}" />
            </c:forEach>
        </ul>

    </c:if>
</body>
</html>