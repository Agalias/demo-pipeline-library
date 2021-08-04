def call() {
    Limitations = [
        'sudo tcdel eth0 --all; sudo tcdel eth1 --all',   //Unlimited
        'sudo sh limit_police500k.sh', //500k
        'sudo sh limit_police150k.sh', //150k
        'sudo sh limit.sh 1000000 0 20 20 172.16.174.3', //20% Loss
        'sudo sh limit.sh 1000000 0 5 20 172.16.174.3', //5% Loss
    ];
    return Limitations.getAt(currentBuild.number%Limitations.size())
}