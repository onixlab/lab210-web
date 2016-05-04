<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
  <body>
    <h3>Adicionar cursos</h3>
    <form action="adicionaCurso">
      Nome:<input name="nome" />
      <form:errors path="curso.nome" cssStyle="color:red"/>
      <br />
      Carga:<input name="cargaHoraria"/>
      <form:errors path="curso.cargaHoraria" cssStyle="color:red"/>
      <br />
      <input type="submit" value="Cadastrar">
    </form>
  </body>
</html>