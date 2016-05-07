<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<body>
  
  <a href="cursoForm">Criar novo curso</a> 

  <br /> <br />        

  <table>
  <tr>
    <th>Id</th>
    <th>Descrição</th>
    <th>Carga horaria</th>
  </tr>
  <c:forEach items="${cursos}" var="curso">
    <tr>
      <td>${curso.id}</td>
      <td>${curso.nome}</td>
      <td>${curso.cargaHoraria}</td>
      <td><a href="alterar">Alterar</a></td>
      <td><a href="remover">Remover</a></td>
    </tr>
  </c:forEach>
  </table>
</body>
</html>