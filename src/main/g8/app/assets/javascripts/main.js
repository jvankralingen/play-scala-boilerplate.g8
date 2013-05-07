require(['config'], function (config) {
	var withConfig = require.config(config.requireJsConfig);

	withConfig(['jquery', 'bootstrap', 'Application'], function ($, _, Application) {
		$(function () {
			new Application();
		});

	});



});