echo "PID Check..."

CURRENT_PID=$(ps -ef | grep java | grep demo* | awk '{print $2}')

echo "Running PID: {$CURRENT_PID}"

if "$CURRENT_PID" [ -z CURRENT_PID ] ; then
    echo "Project is not running"
<200b>else
    kill -9 $CURRENT_PID
   sleep 10
fi

echo "Deploy Project...."

nohup java -jar demo-0.0.1-SNAPSHOT.jar >> demo.log &

echo "Done"