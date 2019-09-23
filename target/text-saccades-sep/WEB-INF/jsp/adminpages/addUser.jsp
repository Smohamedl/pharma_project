<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: U557571
  Date: 22/09/2019
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajout d'un caissier</title>
</head>
<body>

    <form action="adduseraction"  namespace="/" method="post">
        <div class="container">
            <label for="username"><b>identifiant</b></label>
            <input type="text" placeholder="Entrez un identifiant" id ="username" name="username" value="id1" required>

            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" id="psw" name="psw" value="psw" required>

            <label for="firstname"><b>Prenom</b></label>
            <input type="text" placeholder="Entrez un prenom" id="firstname" name="firstname" value="prenom1" required>

            <label for="name"><b>Nom</b></label>
            <input type="text" placeholder="Entrez un nom" id="name" name="name" value="nom1" required>

            <label for="email"><b>Email</b></label>
            <input type="email" placeholder="Entrez un email" id="email" name="email" value="email1@yahoo.fr" required>

            <label for="birthdate"><b>Date de naissance</b></label>
            <input type="date" placeholder="Entrez une date de naissance" id="birthdate" name="birthdate" value="12/08/1996" required>

            <label for="tel"><b>Téléphone</b></label>
            <input type="tel" placeholder="Entrez un numéro de téléphone" id="tel" name="tel" value="37274248" required>

            <button type="submit">Ajouter</button>
        </div>

        <s:if test="hasActionErrors()">
            <div id="fieldErrors">
                <s:actionerror/>
            </div>
        </s:if>

        <s:if test="hasActionMessages()">
            <div id="fieldMessages">
                <s:actionmessage/>
            </div>
        </s:if>

        <div class="container" >
            <button type="button">Effacer les entrées</button>
        </div>
    </form>

</body>
</html>
