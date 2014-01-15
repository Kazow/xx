

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstTest
 */
@WebServlet("/FirstTest")
public class FirstTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>");
//		out.println("</title>");
//		out.println("</head>");
//		out.println("<body>");
//
//		out.println("<p>Test</p>");
//
//		out.println("</body>");
//		out.println("</html>");
		
//		response.setContentType("application/vnd.ms-excel");
//		PrintWriter out = response.getWriter();
//		out.println("\tQ1\tQ2\tQ3\tQ4\tTotal");
//		out.println("Apples\t78\t87\t92\t29\t-SUM(B2:E2)");
//		out.println("Oranges\t77\t86\t93\t30\t=SUM(B3:E3)");
		
		
		BufferedImage b = new BufferedImage(100, 200, BufferedImage.TYPE_INT_RGB);
		Graphics g = b.getGraphics();
		
		g.dispose();
		ImageIO.write(b, "jpeg", response.getOutputStream());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
