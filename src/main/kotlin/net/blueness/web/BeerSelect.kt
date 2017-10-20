package net.blueness.web

import net.blueness.model.BeerExpert
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "BeerSelect", urlPatterns = arrayOf("/SelectBeer.do"))
class BeerSelect : HttpServlet(){
    override fun doPost(req: HttpServletRequest?, resp: HttpServletResponse?) {

        val c = req?.getParameter("color") as String
        val be = BeerExpert()
        val result = be.getBrands(c)

        resp?.contentType = "text/html"
        val out = resp?.writer
        out?.println("Beer Selection Advice<br>")

/*        for (item in result) {
            out?.println("<br>Try: " + item)
        }*/

        req?.setAttribute("styles", result)
        val view = req.getRequestDispatcher("result.jsp")
        view.forward(req, resp)
    }
}