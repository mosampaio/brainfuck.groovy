import static Character.MIN_CODE_POINT

class BFInterpreter {
  def execute(input){
    def tokens = "<>+-.,[]"
    def cells = [MIN_CODE_POINT]
    def pointer = 0
    def count = 0
    def whileStack = []
    while(count < input.size()){
      if (!tokens.contains(input[count])){
        count++
        continue
      }
      switch(input[count]) {
        case ".":
          println Character.toString((char)cells[pointer])
          break
        case ">":
          pointer++
          if (cells[pointer] == null) cells[pointer] = MIN_CODE_POINT
          break
        case "<":
          if (pointer == 0) throw new NullPointerException("Pointer out of range")
          pointer--
          break
        case "+":
          cells[pointer]++
          break
        case "-":
          cells[pointer]--
          break
        case ",":
          cells[pointer] = System.in.read()
          break
        case "[":
          if (cells[pointer] != 0) {
            whileStack << count
          } else {
            while(count < input.size()) {
              if (input[count] == ']') break
              count++
            }
          }
          break
        case "]":
          count = whileStack.pop()
          continue
          break
        default: 
          break
        }
        count++
      }
    println cells
  }

  static void main(args) {
    def interpreter = new BFInterpreter()
    interpreter.execute args[0]
  }
}
