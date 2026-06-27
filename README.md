After clone this repository let do it!

- Step 1: install VScode and add these extension:
     Kotlin - by fwcd
     Code Runner - by formulahendry

- Step 2: open setting.json and add the following configuraion: 
    "code-runner.executorMap": {
        "kotlin": "cd $dir && kotlinc $fileName -include-runtime -d $fileNameWithoutExt.jar && java -jar $fileNameWithoutExt.jar && rm $fileNameWithoutExt.jar"
    }

- Step 3: install Kotlin Compiler - kotlinc
    Tip: You can use AI and ask by promt: 'how to install kotlinc on + your OS (win(version is using), linux(arch...)), MAC'

- Step 4: open the repository in VSCode, choose any file .kt, and press: Ctrl + Alt + N to execute immediately.
