if [ $# -ne 1 ]
   echo "Usage: run.sh [absolute_path_to_file]"
fi

if [[ "$1" = /* ]]
then
   env FileIndexingApiWebModule_File_Path=$1 java -jar target/FileIndexingApiWeb.jar server FileIndexingApiWeb.yml
else
   echo "Please give an absolute path to the file"
fi
