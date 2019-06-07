#!/usr/bin/env bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

cd $DIR

../init.sh

echo "packing sk"
java -jar "$DIR/bootstrap-voodoo.jar" pack sk "$DIR/cotm-majik.lock.json"
if [ ! $? -eq 0 ]; then
    echo "Error in step: Pack SK"
    exit 1
fi
