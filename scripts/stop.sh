echo "PID Check..."

CURRENT_PID=$(ps -ef | grep java | grep demo* | awk '{print $2}')

echo "Running PID: {$CURRENT_PID}"

if [ -z $CURRENT_PID ] ; then
    echo "Project is not running"
else
    sudo kill -9 $CURRENT_PID
    sleep 5
    echo "Project stop"
fi
