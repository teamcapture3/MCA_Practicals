using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace P4D.Controllers
{
    [HandleError]
    public class HomeController : Controller
    {
        public string Index()
        {
            return "Welcome To ASP.NET MVC Application";
        }
    }
}
