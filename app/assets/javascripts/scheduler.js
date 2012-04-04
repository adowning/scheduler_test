function init() {
    scheduler.init('scheduler_here',null,"week");
    scheduler.load("events.xml");
}
window.onload = init; 