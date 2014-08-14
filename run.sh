if [ $# -eq 1 ]
then
	sudo java -classpath .:lib/* -Djava.library.path=rocksaw-1.0.3/lib/ ccs.neu.edu.andang.RawHTTPGet $1
else
	echo "Usage: run.sh [absolute_path_to_file]"
fi

if [[ "$1" = /* ]]
then
   env FileIndexingApiWebModule_File_Path=$1 java -jar target/FileIndexingApiWeb.jar server FileIndexingApiWeb.yml
else
   echo "Please give an absolute path to the file"
fi
