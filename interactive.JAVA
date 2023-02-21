// Add event listener to all portfolio images
var images = document.querySelectorAll('.portfolio-image');
for (var i = 0; i < images.length; i++) {
    images[i].addEventListener('click', function() {
        // Add a class to the clicked image to make it appear larger
        this.classList.toggle('enlarged');
    });
}

// Add event listener to the contact form submit button
var submitButton = document.querySelector('#submit-button');
submitButton.addEventListener('click', function(event) {
    event.preventDefault();
    // Show a message to confirm that the form was submitted successfully
    alert('Thank you for your message! We will get back to you soon.');
});
