function solution(bridge_length, weight, truck_weights) {
    let bridge = [];
    let flag = true;
    
    for (let i = 0; i < bridge_length; i++) {
        bridge.push(0);
    }
    
    let answer = 0;
    let current_weight = 0;
    
    while(flag) {
        const shiftTruck = bridge.shift();
        current_weight -= shiftTruck;
        if (current_weight + truck_weights[0] <= weight) {
            current_weight += truck_weights[0];
            bridge.push(truck_weights.shift());
        } else
            bridge.push(0);
        answer++;

        if (truck_weights.length === 0) {
            answer += bridge_length;
            flag = false;
        }
    }
    return answer;
}