define(['./jsConfig?callback=define'], function (jsConfig) {
	var availableLibraries, paths, library;

	availableLibraries = jsConfig.availableLibraries;
	paths = {};

	// convert the available libraries to a require js format
	for (library in availableLibraries) {
		if (availableLibraries.hasOwnProperty(library)) {
			var path = availableLibraries[library];
			//only add libraries that have a path that is different than their name
			if (library != path) paths[library] = path.replace(/\.js/, '');
		}
	}

	return {
		requireJsConfig: {
			paths : paths,
			waitSeconds: 7,

			config: jsConfig.jsConfig,

			shim : {
				'bootstrap': ['jquery']
			}
		}
	};
});