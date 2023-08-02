public class LoggerFactory {
    public static Logger getLogger() {
        // Вернуть конкретную реализацию логгера (например, log4j, slf4j, или просто консольный логгер)
        // В данном примере вернем просто ConsoleLogger.
        return new ConsoleLogger();
    }
}
