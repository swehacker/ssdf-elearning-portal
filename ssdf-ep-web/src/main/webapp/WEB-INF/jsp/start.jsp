<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<div class="container">
    <div id="news"></div>
<script>
    $('document').ready(function() {
        $.getJSON('/rest/1/news', function (data) {
            $.each(data, function () {
                $('<div class="col-md-3">')
                        .append('<div class="news"><div class="message"><h4>' + this.title + '</h4><p>' + this.description + '</p></div><div class="author"><i>' + this.author + '</i></div><div class="link"><a href="'+ this.link + '"><i>Läs mer -></i></a></div></div></div>')
                        .appendTo('#news');
            })
        });
    });
</script>
</div>
