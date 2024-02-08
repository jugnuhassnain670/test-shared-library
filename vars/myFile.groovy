def call(String filePath) {
    def htmlContent = readFile(filePath)
    echo "Contents of ${filePath}:"
    echo htmlContent
}
