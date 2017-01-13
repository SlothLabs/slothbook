<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <title<tiles:getAsString name="title" /></title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-12" id="header">
                    <tiles:insertAttribute name="header" />
                </div>
            </div>
            <div class="row">
                <div id="body">
                    <tiles:insertAttribute name="body" />
                </div>
            </div>
            <div class="row">
                <div class="col-md-12" id="footer" style="margin-top:200px;border-top:1px solid gray">
                    <tiles:insertAttribute name="footer" />
                </div>
            </div>
        </div>
    </body>
</html>