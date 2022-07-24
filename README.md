# ScalaLearnings

This are my draft while learning Functional Programing language from https://www.coursera.org/learn/scala2-functional-programming.

I will **not publish any excercise answer**


## Using Ubuntu 18.04 + WSL2 in Windows 11

1. Fresh Ubuntu 18.04
2. Update apt `sudo apt-get update`
3. Install JDK 11 (e.g. `sudo apt install openjdk-11-jdk`)
4. Add JDK to the Path (e.g. `export PATH="/PATH/TO/YOUR/jdk11-VERSION/bin:$PATH"`)
5. Setup coursier (`curl -fLo coursier https://github.com/coursier/launchers/raw/master/coursier && chmod +x coursier && ./coursier`)
6. Install coursier things (`./coursier setup`)
7. Add coursier on Path (`export PATH="~/.local/share/coursier/bin:$PATH"`)
8. run `code .` to launch VS Code
9. Install the extension *Metals* on your VS Code

After that **ANY** zip that you download from coursera needs to be copied using your user on linux to a folder inside `home`, so your user have the ownership of 
that and when you run `code .` the extension Metals can run everything normally. 


## Tips

1. To Exist from the `console` (inside sbt) use `:q`
