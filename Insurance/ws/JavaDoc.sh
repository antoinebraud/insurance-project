cd ../javaDoc
mkdir $1
cd ../ws
javadoc -charset UTF8 -private -d ../javaDoc/$1 ../src/$1.java
