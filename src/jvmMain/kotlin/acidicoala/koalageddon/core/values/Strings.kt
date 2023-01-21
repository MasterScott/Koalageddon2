package acidicoala.koalageddon.core.values

import acidicoala.koalageddon.BuildConfig

sealed class Strings(
    val appId: String = "App ID",
    val appStatusOriginal: String,
    val appStatusUnlocked: String,
    val appStatusLocked: String,
    val autoInjectInventory: String,
    val cacheSize: String,
    val cancel: String,
    val checkForUpdates: String,
    val clearCache: String,
    val computing: String,
    val configuration: String,
    val confirmForceModifyInstallationMessage: String,
    val confirmForceModifyInstallationTitle: String,
    val defaultAppStatus: String,
    val dlcId: String = "DLC ID",
    val downloadingRelease: String,
    val extraInventoryItems: String,
    val fetchingToolInfo: String,
    val gameMode: String,
    val inDevelopment: String,
    val information: String,
    val install: String,
    val installation: String,
    val installationError: String,
    val installationStatus: String,
    val installationSuccess: String,
    val installed: String,
    val itemId: String = "Item ID",
    val language: String,
    val languageEn: String = "English",
    val languageRu: String = "Русский",
    val logging: String,
    val modifyInstallation: String,
    val ok: String = "OK",
    val openDataDirectory: String,
    val openLatestReleasePage: String,
    val openOfficialForumTopic: String,
    val overrideAppStatus: String,
    val overrideDlcStatus: String,
    val notInstalled: String,
    val processStatusRunning: String,
    val processStatusNotRunning: String,
    val refreshStatus: String,
    val reloadConfig: String,
    val reloadConfigTooltip: String,
    val reloadConfigSuccess: String,
    val reloadConfigError: String,
    val settings: String,
    val startPage: String,
    val startPageWelcome: String,
    val storeMode: String,
    val storeProcessStatus: String,
    val storeEpic: String = "Epic Game Store",
    val storeSteam: String = "Steam",
    val storeUbisoft: String = "Ubisoft Connect",
    val theme: String,
    val themeDark: String,
    val themeLight: String,
    val toolConfig: String,
    val toolDll: String = "%0 DLL",
    val removalError: String,
    val removalSuccess: String,
    val remove: String,
    val unlockFamilySharing: String,
    val version: String,
) {
    object English : Strings(
        autoInjectInventory = "Automatically inject items into a game's Steam inventory",
        appStatusOriginal = "Original",
        appStatusUnlocked = "Unlocked",
        appStatusLocked = "Locked",
        cacheSize = "Cache size: %0",
        cancel = "Cancel",
        checkForUpdates = "Check for updates",
        clearCache = "Clear cache",
        computing = "Computing",
        configuration = "Configuration",
        confirmForceModifyInstallationMessage = "Process %0 has been found currently running on your system. " + "To modify installation status, it is necessary to close this process. " + "Do you wish to proceed with installation by forcibly closing it?",
        confirmForceModifyInstallationTitle = "Proceed with installation / removal?",
        defaultAppStatus = "Default game status",
        downloadingRelease = "Downloading %0 release: %1 out of %2",
        extraInventoryItems = "Inject extra items into a game's Steam inventory",
        fetchingToolInfo = "Fetching %0 info",
        gameMode = "Game mode",
        inDevelopment = "In development",
        information = "Information",
        install = "Install",
        installation = "Installation",
        installationError = "❌ Installation error",
        installationStatus = "Installation status",
        installationSuccess = "✅ Installation was successful",
        installed = "Installed %0",
        language = "Language",
        logging = "Logging",
        modifyInstallation = "Modify installation",
        openDataDirectory = "Open data directory",
        openLatestReleasePage = "Open latest release page",
        openOfficialForumTopic = "Open official forum topic",
        overrideAppStatus = "Override game status",
        overrideDlcStatus = "Override DLC status",
        notInstalled = "Not installed",
        processStatusRunning = "Running",
        processStatusNotRunning = "Not running",
        refreshStatus = "Refresh status",
        reloadConfig = "Reload configuration",
        reloadConfigTooltip = "Reloads configuration in a running Steam process",
        reloadConfigSuccess = "✅ Configuration was successfully reloaded",
        reloadConfigError = "❌ Error reloading configuration",
        settings = "Settings",
        startPage = "Start page",
        startPageWelcome = "Welcome to Koalageddon %0",
        storeMode = "Store mode",
        storeProcessStatus = "%0 process status",
        theme = "Theme",
        themeDark = "Dark",
        themeLight = "Light",
        toolConfig = "%0 config",
        removalError = "❌ Removal error",
        removalSuccess = "✅ Removal success",
        remove = "Remove",
        unlockFamilySharing = "Unlock Family Sharing",
        version = "Version v${BuildConfig.APP_VERSION}",
    )

    object German : Strings(
        autoInjectInventory = "Gegenstände automatisch zum Steam Inventar unterstützter Spiele hinzufügen",
        appStatusOriginal = "Original",
        appStatusUnlocked = "Freigeschaltet",
        appStatusLocked = "Gesperrt",
        cacheSize = "Größe des Caches: %0",
        cancel = "Abbrechen",
        checkForUpdates = "Nach Updates suchen",
        clearCache = "Cache löschen",
        computing = "Berechne",
        configuration = "Konfiguration",
        confirmForceModifyInstallationMessage = "Auf Ihrem System wird derzeit Prozess %0 ausgeführt. " + "Um den Status der Installation ändern zu können, muss dieser Prozess zunächst beendet werden. " + "Möchten Sie den Prozess jetzt schließen und mit der Installation fortfahren?",
        confirmForceModifyInstallationTitle = "Proceed with installation / removal?",
        defaultAppStatus = "Standard Spielstatus",
        downloadingRelease = "Lade %0 Veröffenlichung herunter: %1 von %2",
        extraInventoryItems = "Zusätzliche Gegenstände zum Steam Inventar unterstützter Spiele hinzufügen",
        fetchingToolInfo = "Rufe %0 Daten ab",
        gameMode = "Spielmodus",
        inDevelopment = "In Arbeit",
        information = "Information",
        install = "Installieren",
        installation = "Installation",
        installationError = "❌ Fehler bei der Installation",
        installationStatus = "Status der Installation",
        installationSuccess = "✅ Die Installation war erfolgreich",
        installed = "%0 installiert",
        language = "Sprache",
        logging = "Logdatei erstellen",
        modifyInstallation = "Installation modifizieren",
        openDataDirectory = "Datenordner öffnen",
        openLatestReleasePage = "Seite der neuesten Veröffentlichung öffnen",
        openOfficialForumTopic = "Seite des offiziellen Forum-Themas öffnen",
        overrideAppStatus = "Spielstatus überschreiben",
        overrideDlcStatus = "DLC Status überschreiben",
        notInstalled = "Nicht installiert",
        processStatusRunning = "Wird ausgeführt",
        processStatusNotRunning = "Wird nicht ausgeführt",
        refreshStatus = "Status aktualisieren",
        reloadConfig = "Konfiguration neu laden",
        reloadConfigTooltip = "Lädt die Konfiguration bei laufendem Steam Prozess neu",
        reloadConfigSuccess = "✅ Die Konfiguration wurde erfolgreich neu geladen",
        reloadConfigError = "❌ Fehler beim Neuladen der Konfiguration",
        settings = "Einstellungen",
        startPage = "Startseite",
        startPageWelcome = "Willkommen zu Koalageddon %0",
        storeMode = "Spieleplatform Modus",
        storeProcessStatus = "%0 Prozess Status",
        theme = "Aussehen",
        themeDark = "Dunkel",
        themeLight = "Hell",
        toolConfig = "%0 Konfiguration",
        removalError = "❌ Fehler beim Entfernen",
        removalSuccess = "✅ Das Entfernen war erfolgreich.",
        remove = "Entfernen",
        unlockFamilySharing = "Steam Family Sharing freischalten",
        version = "Version v${BuildConfig.APP_VERSION}",
    )

    object Russian : Strings(
        autoInjectInventory = "Автоматически внедрять предметы в игровой Steam инвентарь",
        appStatusOriginal = "Оригинальный",
        appStatusUnlocked = "Разблокированный",
        appStatusLocked = "Заблокированный",
        cacheSize = "Размер кэша: %0",
        cancel = "Отменить",
        checkForUpdates = "Проверить обновления",
        clearCache = "Очистить кэш",
        computing = "Вычисляется",
        configuration = "Конфигурация",
        confirmForceModifyInstallationMessage = "Процесс %0 был найден в настоящее время работающим на вашей системе. " + "Чтобы изменить статус установки, необходимо закрыть этот процесс. " + "Вы хотите продолжить установку, принудительно закрыв его?",
        confirmForceModifyInstallationTitle = "Продолжить установку / удаление?",
        defaultAppStatus = "Статус игр по умолчанию",
        downloadingRelease = "Загрузка %0 релиза: %1 из %2",
        extraInventoryItems = "Внедрить дополнительные предметы в игровой  Steam инвентарь",
        fetchingToolInfo = "Получение данных %0",
        gameMode = "Режим игры",
        inDevelopment = "В разработке",
        information = "Информация",
        install = "Установить",
        installation = "Установка",
        installationError = "❌ Ошибка установки",
        installationStatus = "Статус установки",
        installationSuccess = "✅ Установка прошла успешно",
        installed = "Установлено %0",
        language = "Язык",
        logging = "Логирование",
        modifyInstallation = "Изменить установку",
        openDataDirectory = "Открыть директорию данных",
        openLatestReleasePage = "Открыть страницу последнего релиза",
        openOfficialForumTopic = "Открыть официальный топик форума",
        overrideAppStatus = "Заменить статус игры",
        overrideDlcStatus = "Заменить статус DLC",
        notInstalled = "Не установлено",
        processStatusRunning = "Запущен",
        processStatusNotRunning = "Закрыт",
        refreshStatus = "Обновить статус",
        reloadConfig = "Перезагрузить конфигурацию",
        reloadConfigTooltip = "Перезагружает конфигурацию в запущенном процессе Steam",
        reloadConfigSuccess = "✅ Конфигурация успешно перезагружена",
        reloadConfigError = "❌ Ошибка перезагрузки конфигурации",
        settings = "Настройки",
        startPage = "Стартовая страница",
        startPageWelcome = "Добро пожаловать в Koalageddon %0",
        storeMode = "Режим магазина",
        storeProcessStatus = "Статус процесса %0",
        theme = "Тема",
        themeDark = "Тёмная",
        themeLight = "Светлая",
        toolConfig = "Конфигурация %0",
        removalError = "❌ Ошибка удаления",
        removalSuccess = "✅ Удаление прошло успешно",
        remove = "Удалить",
        unlockFamilySharing = "Разблокировать Family Sharing",
        version = "Версия v${BuildConfig.APP_VERSION}",
    )
}


