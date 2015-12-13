<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div>
	<h2>bla bla bla bla bla</h2>
	<h3>blablablablablablabla</h3>

	<ol class="spittle-list">
		<c:forEach var="spittle" items="${spittles }">
			<s:url value="/spitters/"></s:url>

		</c:forEach>
	</ol>
</div>