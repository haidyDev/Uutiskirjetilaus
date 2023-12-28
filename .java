@WebServlet("/subscribe")
public class NewsletterSubscriptionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        String email = request.getParameter("email");
        
        // toiminnot tallentaa sähköpostiosoitteen tietokantaan 
        //ja lähettää vahvistussähköpostin.
        
        response.setContentType("text/plain");
        response.getWriter().write("Kiitos tilauksesta, " + email + 
        "! Uutiskirje lähetetään pian.");
    }
}
