package hello

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}

class Handler extends RequestHandler[Request, Response] {

  def handleRequest(input: Request, context: Context): Response = {
    println("Hello world")
    println(context)
    Response("Hello world", input)
  }
}

object LocalTest {
  def main(args: Array[String]): Unit = {
    val input = new Request("a", "b", "c")
    println(new Handler().handleRequest(input, null))
  }
}
