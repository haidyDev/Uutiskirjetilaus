document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('newsletterForm');
    const messageElement = document.getElementById('message');

    form.addEventListener('submit', function(event) {
        event.preventDefault();
        
        const email = document.getElementById('email').value;

        // lähettää sähköpostin 
        //tallentaa tietokantaan
        // viesti onnistuneesta tilauksesta
        
        messageElement.textContent = `Kiitos tilauksesta, 
        ${email}! Uutiskirje lähetetään pian.`;
        form.reset();
    });
});
