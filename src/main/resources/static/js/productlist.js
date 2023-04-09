/**
 * 
 */
 
$(document).ready(
	function() {
		/*$('#message').click(function(page) {
    var data = $('#form').serialize()
    $.ajax({
      type: 'GET',
      url: window.location,
      data: {
		"page": page,
		data	
		},
      success: function(result) {
        $("#content").text("Hello");
      },
      error: function(xhr, status, error) {
        $("#content").text(error)
      }
    });
  });*/

	searchProduct = function(page){
		var data = $('#form').serialize()
    $.ajax({
      type: 'GET',
      url: window.location,
      data: {
		"page": page,
		data	
		},
      success: function(result) {
        $("#content").text(page);
      },
      error: function(xhr, status, error) {
        $("#content").text(error)
      }
    });
	}
	}
)