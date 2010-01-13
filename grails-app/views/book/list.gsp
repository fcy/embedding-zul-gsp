

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="main" />
        <z:head />
        <title>Book List</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${resource(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create">New Book</g:link></span>
        </div>
        <div class="body">
            <h1>Book List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>

            <z:body />
        </div>
    </body>
</html>
