import { StatusBar, StyleSheet } from 'react-native';
import { theme } from '../../styles/themes';

export const styles = StyleSheet.create({
  container: {
    width: 400,
    height: 60,
    backgroundColor: theme.colors.blackBlue,
    borderRadius: 6,
    alignItems: 'center',
    marginTop: (StatusBar.currentHeight || 0) * 0.50,
    flexDirection: 'row'
  },

  icon: {
    padding: 15,
  },
  
  divider: {
    width: 2,
    height: '80%',
    backgroundColor: theme.colors.gray,
  },

  text: {
    color: theme.colors.gray,
    fontFamily: theme.fonts.bold,
    fontSize: 16,
    marginLeft: 10,
  }
});
