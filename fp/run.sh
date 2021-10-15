#~/usr/bin.bash

FILE_NAME="$1"
echo "compiling $FILE_NAME.."

javac $FILE_NAME.java

echo ""

java $FILE_NAME

rm *.class
