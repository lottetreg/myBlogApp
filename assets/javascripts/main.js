$(function() {
    $('#new-post').on('submit', function(e) {
        e.preventDefault();
        var data = $("#new-post :input").serializeArray();
        console.log(data);
    });
});
