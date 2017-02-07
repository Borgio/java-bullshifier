#!/bin/bash

script_dir="$( cd "$( dirname "$0" )" && pwd )"
cd $script_dir/..

target_dir=`pwd`/small
classes_count=10

echo "Generating to $target_dir"
./gradlew run -Poutput-directory=$target_dir -Pclasses=$classes_count

if [ "$?" != "0" ]; then
	exit 1
fi

cd $target_dir

echo "Compiling"
gradle fatJar

echo ""
echo "Done"
echo ""
echo "To execute the new tester run:"
echo ""
echo "java -cp $target_dir/build/libs/tester.jar helpers.Main"
echo ""
